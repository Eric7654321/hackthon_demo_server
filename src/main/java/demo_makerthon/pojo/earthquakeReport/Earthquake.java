/**
  * Copyright 2024 bejson.com 
  */
package demo_makerthon.pojo.earthquakeReport;

import lombok.AllArgsConstructor;
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
public class Earthquake {

    private long EarthquakeNo;
    private String ReportType;
    private String ReportColor;
    private String ReportContent;
    private String ReportImageURI;
    private String ReportRemark;
    private String Web;
    private String ShakemapImageURI;
    private EarthquakeInfo EarthquakeInfo;
    private Intensity Intensity;
    public void setEarthquakeNo(long EarthquakeNo) {
         this.EarthquakeNo = EarthquakeNo;
     }
     public long getEarthquakeNo() {
         return EarthquakeNo;
     }

    public void setReportType(String ReportType) {
         this.ReportType = ReportType;
     }
     public String getReportType() {
         return ReportType;
     }

    public void setReportColor(String ReportColor) {
         this.ReportColor = ReportColor;
     }
     public String getReportColor() {
         return ReportColor;
     }

    public void setReportContent(String ReportContent) {
         this.ReportContent = ReportContent;
     }
     public String getReportContent() {
         return ReportContent;
     }

    public void setReportImageURI(String ReportImageURI) {
         this.ReportImageURI = ReportImageURI;
     }
     public String getReportImageURI() {
         return ReportImageURI;
     }

    public void setReportRemark(String ReportRemark) {
         this.ReportRemark = ReportRemark;
     }
     public String getReportRemark() {
         return ReportRemark;
     }

    public void setWeb(String Web) {
         this.Web = Web;
     }
     public String getWeb() {
         return Web;
     }

    public void setShakemapImageURI(String ShakemapImageURI) {
         this.ShakemapImageURI = ShakemapImageURI;
     }
     public String getShakemapImageURI() {
         return ShakemapImageURI;
     }

    public void setEarthquakeInfo(EarthquakeInfo EarthquakeInfo) {
         this.EarthquakeInfo = EarthquakeInfo;
     }
     public EarthquakeInfo getEarthquakeInfo() {
         return EarthquakeInfo;
     }

    public void setIntensity(Intensity Intensity) {
         this.Intensity = Intensity;
     }
     public Intensity getIntensity() {
         return Intensity;
     }

}