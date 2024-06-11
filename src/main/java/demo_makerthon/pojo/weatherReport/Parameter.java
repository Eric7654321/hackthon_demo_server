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
public class Parameter {

    private String parameterName;
    private String parameterValue;
    public void setParameterName(String parameterName) {
         this.parameterName = parameterName;
     }
     public String getParameterName() {
         return parameterName;
     }

    public void setParameterValue(String parameterValue) {
         this.parameterValue = parameterValue;
     }
     public String getParameterValue() {
         return parameterValue;
     }

}