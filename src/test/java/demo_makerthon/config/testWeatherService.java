package demo_makerthon.config;

import demo_makerthon.service.EarthquackService;
import demo_makerthon.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class testWeatherService {
    @Autowired
    private WeatherService weatherService;
    @Autowired
    private EarthquackService earthquackService;

    @Test
    public void testWeatherService(){
        weatherService.weatherSearch();
    }

    @Test
    public void testEarthquakeService(){
        earthquackService.quakeSearch();
    }
}
