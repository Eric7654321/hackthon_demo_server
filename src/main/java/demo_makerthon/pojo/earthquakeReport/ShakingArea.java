/**
  * Copyright 2024 bejson.com 
  */
package demo_makerthon.pojo.earthquakeReport;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Auto-generated: 2024-05-04 13:27:55
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
@NoArgsConstructor
public class ShakingArea {

    private String AreaDesc;
    private String CountyName;
    private String InfoStatus;
    private String AreaIntensity;
    private List<EqStation> EqStation;
    public void setAreaDesc(String AreaDesc) {
         this.AreaDesc = AreaDesc;
     }
     public String getAreaDesc() {
         return AreaDesc;
     }

    public void setCountyName(String CountyName) {
         this.CountyName = CountyName;
     }
     public String getCountyName() {
         return CountyName;
     }

    public void setInfoStatus(String InfoStatus) {
         this.InfoStatus = InfoStatus;
     }
     public String getInfoStatus() {
         return InfoStatus;
     }

    public void setAreaIntensity(String AreaIntensity) {
         this.AreaIntensity = AreaIntensity;
     }
     public String getAreaIntensity() {
         return AreaIntensity;
     }

    public void setEqStation(List<EqStation> EqStation) {
         this.EqStation = EqStation;
     }
     public List<EqStation> getEqStation() {
         return EqStation;
     }

}