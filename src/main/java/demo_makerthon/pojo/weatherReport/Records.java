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
public class Records {

    private String datasetDescription;
    private List<Location> location;
    public void setDatasetDescription(String datasetDescription) {
         this.datasetDescription = datasetDescription;
     }
     public String getDatasetDescription() {
         return datasetDescription;
     }

    public void setLocation(List<Location> location) {
         this.location = location;
     }
     public List<Location> getLocation() {
         return location;
     }

}