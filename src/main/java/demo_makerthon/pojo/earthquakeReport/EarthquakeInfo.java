/**
  * Copyright 2024 bejson.com 
  */
package demo_makerthon.pojo.earthquakeReport;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Auto-generated: 2024-05-04 13:27:55
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
@NoArgsConstructor
public class EarthquakeInfo {

    private Date OriginTime;
    private String Source;
    private double FocalDepth;
    private Epicenter Epicenter;
    private EarthquakeMagnitude EarthquakeMagnitude;
    public void setOriginTime(Date OriginTime) {
         this.OriginTime = OriginTime;
     }
     public Date getOriginTime() {
         return OriginTime;
     }

    public void setSource(String Source) {
         this.Source = Source;
     }
     public String getSource() {
         return Source;
     }

    public void setFocalDepth(double FocalDepth) {
         this.FocalDepth = FocalDepth;
     }
     public double getFocalDepth() {
         return FocalDepth;
     }

    public void setEpicenter(Epicenter Epicenter) {
         this.Epicenter = Epicenter;
     }
     public Epicenter getEpicenter() {
         return Epicenter;
     }

    public void setEarthquakeMagnitude(EarthquakeMagnitude EarthquakeMagnitude) {
         this.EarthquakeMagnitude = EarthquakeMagnitude;
     }
     public EarthquakeMagnitude getEarthquakeMagnitude() {
         return EarthquakeMagnitude;
     }

}