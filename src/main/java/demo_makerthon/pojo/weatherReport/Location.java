/**
  * Copyright 2024 bejson.com 
  */
package demo_makerthon.pojo.weatherReport;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Auto-generated: 2024-05-05 1:27:44
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
@NoArgsConstructor
public class Location {

    private String locationName;
    private List<WeatherElement> weatherElement;
    public void setLocationName(String locationName) {
         this.locationName = locationName;
     }
     public String getLocationName() {
         return locationName;
     }

    public void setWeatherElement(List<WeatherElement> weatherElement) {
         this.weatherElement = weatherElement;
     }
     public List<WeatherElement> getWeatherElement() {
         return weatherElement;
     }

}