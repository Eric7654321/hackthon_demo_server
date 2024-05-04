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
public class Intensity {

    private List<ShakingArea> ShakingArea;
    public void setShakingArea(List<ShakingArea> ShakingArea) {
         this.ShakingArea = ShakingArea;
     }
     public List<ShakingArea> getShakingArea() {
         return ShakingArea;
     }

}