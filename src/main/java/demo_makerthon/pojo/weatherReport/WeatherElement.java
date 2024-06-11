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
public class WeatherElement {

    private String elementName;
    private List<Time> time;
    public void setElementName(String elementName) {
         this.elementName = elementName;
     }
     public String getElementName() {
         return elementName;
     }

    public void setTime(List<Time> time) {
         this.time = time;
     }
     public List<Time> getTime() {
         return time;
     }

}