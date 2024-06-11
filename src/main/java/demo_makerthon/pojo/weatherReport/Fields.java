/**
  * Copyright 2024 bejson.com 
  */
package demo_makerthon.pojo.weatherReport;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Auto-generated: 2024-05-05 1:27:44
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
@NoArgsConstructor
public class Fields {

    private String id;
    private String type;
    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

}