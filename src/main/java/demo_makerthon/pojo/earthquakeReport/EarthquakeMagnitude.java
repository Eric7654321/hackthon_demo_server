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
public class EarthquakeMagnitude {

    private String MagnitudeType;
    private double MagnitudeValue;
    public void setMagnitudeType(String MagnitudeType) {
         this.MagnitudeType = MagnitudeType;
     }
     public String getMagnitudeType() {
         return MagnitudeType;
     }

    public void setMagnitudeValue(double MagnitudeValue) {
         this.MagnitudeValue = MagnitudeValue;
     }
     public double getMagnitudeValue() {
         return MagnitudeValue;
     }

}