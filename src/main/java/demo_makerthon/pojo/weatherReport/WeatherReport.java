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
public class WeatherReport {

    private String success;
    private Result result;
    private Records records;
    public void setSuccess(String success) {
         this.success = success;
     }
     public String getSuccess() {
         return success;
     }

    public void setResult(Result result) {
         this.result = result;
     }
     public Result getResult() {
         return result;
     }

    public void setRecords(Records records) {
         this.records = records;
     }
     public Records getRecords() {
         return records;
     }

}