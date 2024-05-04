/**
  * Copyright 2024 bejson.com 
  */
package demo_makerthon.pojo.earthquakeReport;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Auto-generated: 2024-05-04 13:27:55
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
@NoArgsConstructor
public class Pga {

    private String unit;
    private double EWComponent;
    private double NSComponent;
    private double VComponent;
    private double IntScaleValue;
    public void setUnit(String unit) {
         this.unit = unit;
     }
     public String getUnit() {
         return unit;
     }

    public void setEWComponent(double EWComponent) {
         this.EWComponent = EWComponent;
     }
     public double getEWComponent() {
         return EWComponent;
     }

    public void setNSComponent(double NSComponent) {
         this.NSComponent = NSComponent;
     }
     public double getNSComponent() {
         return NSComponent;
     }

    public void setVComponent(double VComponent) {
         this.VComponent = VComponent;
     }
     public double getVComponent() {
         return VComponent;
     }

    public void setIntScaleValue(double IntScaleValue) {
         this.IntScaleValue = IntScaleValue;
     }
     public double getIntScaleValue() {
         return IntScaleValue;
     }

}