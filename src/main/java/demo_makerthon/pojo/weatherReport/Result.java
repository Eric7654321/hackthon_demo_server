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
public class Result {

    private String resource_id;
    private List<Fields> fields;
    public void setResource_id(String resource_id) {
         this.resource_id = resource_id;
     }
     public String getResource_id() {
         return resource_id;
     }

    public void setFields(List<Fields> fields) {
         this.fields = fields;
     }
     public List<Fields> getFields() {
         return fields;
     }

}