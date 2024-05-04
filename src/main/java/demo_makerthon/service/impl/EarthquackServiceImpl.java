package demo_makerthon.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import demo_makerthon.pojo.MiniReport;
import demo_makerthon.pojo.earthquakeReport.Earthquake;
import demo_makerthon.pojo.earthquakeReport.EqStation;
import demo_makerthon.pojo.earthquakeReport.Report;
import demo_makerthon.pojo.earthquakeReport.ShakingArea;
import demo_makerthon.service.EarthquackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class EarthquackServiceImpl implements EarthquackService {
    @Override
    public List<MiniReport> quakeSearch() {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://opendata.cwa.gov.tw")
                .build();

        Mono<String> mono = webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/api/v1/rest/datastore/E-A0016-001")
                        .queryParam("authorization","CWA-5AFF81EB-5D90-4850-BAE5-4F3E7DBFC9DA")
                        .queryParam("limit", 1)
                        .queryParam("AreaName", "臺北市")
                        .queryParam("sort", "OriginTime")
                        .build())
                .retrieve()
                .bodyToMono(String.class);

        String quackData = mono.block();
        log.info(LocalDateTime.now() + " 已抓取地震資訊");
        System.out.println(quackData);

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();;
        Report report = gson.fromJson(quackData, Report.class);
        System.out.println(report);

        List<MiniReport> miniReports = new ArrayList<>();

        boolean hasTaipei = false;

        for (Earthquake earthquake : report.getRecords().getEarthquake()) {
            for (ShakingArea shakingArea : earthquake.getIntensity().getShakingArea()) {
                if (shakingArea.getCountyName().equals("臺北市")) {
                    for (EqStation eqStation : shakingArea.getEqStation()) {
                        LocalDateTime time = earthquake.getEarthquakeInfo().getOriginTime().toInstant()
                                .atZone(ZoneId.systemDefault())
                                .toLocalDateTime();
                        String place = eqStation.getStationName();
                        String magnitude = String.valueOf(earthquake.getEarthquakeInfo().getEarthquakeMagnitude().getMagnitudeValue());
                        boolean isShake = (Integer.parseInt(magnitude) >= 3) ? true : false;

                        MiniReport miniReport = new MiniReport(time, place, magnitude,isShake);
                        miniReports.add(miniReport);
                        hasTaipei = true;
                    }
                }
            }
        }

        if (!hasTaipei) {
            LocalDateTime time = LocalDateTime.now();
            String place = "臺北市";
            String magnitude = "0";
            MiniReport miniReport = new MiniReport(time, place, magnitude, false);
            miniReports.add(miniReport);
        }

        System.out.println(miniReports);
        for (MiniReport mr : miniReports) {
            mr.getMiniReport();
        }
        return miniReports;
    }
}
