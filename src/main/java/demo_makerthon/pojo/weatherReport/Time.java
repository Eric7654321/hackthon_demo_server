/**
  * Copyright 2024 bejson.com 
  */
package demo_makerthon.pojo.weatherReport;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Auto-generated: 2024-05-05 1:27:44
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
@NoArgsConstructor
public class Time {

    private Date startTime;
    private Date endTime;
    private Parameter parameter;
    public void setStartTime(Date startTime) {
         this.startTime = startTime;
     }
     public Date getStartTime() {
         return startTime;
     }

    public void setEndTime(Date endTime) {
         this.endTime = endTime;
     }
     public Date getEndTime() {
         return endTime;
     }

    public void setParameter(Parameter parameter) {
         this.parameter = parameter;
     }
     public Parameter getParameter() {
         return parameter;
     }

}