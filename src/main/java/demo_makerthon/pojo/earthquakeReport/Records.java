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
public class Records {

    private String datasetDescription;
    private List<Earthquake> Earthquake;
    public void setDatasetDescription(String datasetDescription) {
         this.datasetDescription = datasetDescription;
     }
     public String getDatasetDescription() {
         return datasetDescription;
     }

    public void setEarthquake(List<Earthquake> Earthquake) {
         this.Earthquake = Earthquake;
     }
     public List<Earthquake> getEarthquake() {
         return Earthquake;
     }

}