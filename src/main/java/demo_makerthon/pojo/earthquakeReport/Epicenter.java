/**
  * Copyright 2024 bejson.com 
  */
package demo_makerthon.pojo.earthquakeReport;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Auto-generated: 2024-05-04 13:27:55
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
@NoArgsConstructor
public class Epicenter {

    private String Location;
    private double EpicenterLatitude;
    private double EpicenterLongitude;
    public void setLocation(String Location) {
         this.Location = Location;
     }
     public String getLocation() {
         return Location;
     }

    public void setEpicenterLatitude(double EpicenterLatitude) {
         this.EpicenterLatitude = EpicenterLatitude;
     }
     public double getEpicenterLatitude() {
         return EpicenterLatitude;
     }

    public void setEpicenterLongitude(double EpicenterLongitude) {
         this.EpicenterLongitude = EpicenterLongitude;
     }
     public double getEpicenterLongitude() {
         return EpicenterLongitude;
     }

}