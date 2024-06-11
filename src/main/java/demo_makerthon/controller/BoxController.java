package demo_makerthon.controller;

import demo_makerthon.pojo.Device;
import demo_makerthon.pojo.MiniReport;
import demo_makerthon.pojo.MiniWeatherReport;
import demo_makerthon.pojo.Result;
import demo_makerthon.service.BoxService;
import demo_makerthon.service.DemoService;
import demo_makerthon.service.EarthquackService;
import demo_makerthon.service.WeatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RequestMapping
@RestController
public class BoxController {
    @Autowired
    private BoxService boxService;
    @Autowired
    private EarthquackService earthquackService;
    @Autowired
    private WeatherService weatherService;

    private Integer debugMode = 0;

    @CrossOrigin(origins = "*")
    @GetMapping("/debugMode/{type}")
    public Result setDebug(@PathVariable Integer type){
        log.info("更改mode");
        System.out.println("更改mode");

        if(type == 1){
            debugMode = debugMode * (-1) + 1;
        }
        boolean isDebug = (debugMode == 1) ? true : false;
        return Result.success(isDebug);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/data/alert")
    public Result getMagnitude(){
        log.info("getMagnitude已被呼叫");
        System.out.println("getMagnitude已被呼叫");

        List<MiniReport> list = earthquackService.quakeSearch();

        if(debugMode == 1){
            for (MiniReport minRp: list) {
                minRp.setMagnitude("6");
                minRp.setShake(true);
            }
        }

        return Result.success(list);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/search")
    public Result getBoxInfo(){
        log.info("取得裝置資訊");
        List<Device> devices = boxService.getDevice();
        System.out.println(devices);
        return Result.success(devices);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/data/weather")
    public Result getWeather(){
        log.info("getWeather已被呼叫");
        System.out.println("getWeather被呼叫");

        MiniWeatherReport miniWeatherReport = weatherService.weatherSearch();

        return Result.success(miniWeatherReport);
    }

}
