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
public class EqStation {

    private Pga pga;
    private Pgv pgv;
    private String StationName;
    private String StationID;
    private String InfoStatus;
    private double BackAzimuth;
    private double EpicenterDistance;
    private String SeismicIntensity;
    private double StationLatitude;
    private double StationLongitude;
    private String WaveImageURI;
    public void setPga(Pga pga) {
         this.pga = pga;
     }
     public Pga getPga() {
         return pga;
     }

    public void setPgv(Pgv pgv) {
         this.pgv = pgv;
     }
     public Pgv getPgv() {
         return pgv;
     }

    public void setStationName(String StationName) {
         this.StationName = StationName;
     }
     public String getStationName() {
         return StationName;
     }

    public void setStationID(String StationID) {
         this.StationID = StationID;
     }
     public String getStationID() {
         return StationID;
     }

    public void setInfoStatus(String InfoStatus) {
         this.InfoStatus = InfoStatus;
     }
     public String getInfoStatus() {
         return InfoStatus;
     }

    public void setBackAzimuth(double BackAzimuth) {
         this.BackAzimuth = BackAzimuth;
     }
     public double getBackAzimuth() {
         return BackAzimuth;
     }

    public void setEpicenterDistance(double EpicenterDistance) {
         this.EpicenterDistance = EpicenterDistance;
     }
     public double getEpicenterDistance() {
         return EpicenterDistance;
     }

    public void setSeismicIntensity(String SeismicIntensity) {
         this.SeismicIntensity = SeismicIntensity;
     }
     public String getSeismicIntensity() {
         return SeismicIntensity;
     }

    public void setStationLatitude(double StationLatitude) {
         this.StationLatitude = StationLatitude;
     }
     public double getStationLatitude() {
         return StationLatitude;
     }

    public void setStationLongitude(double StationLongitude) {
         this.StationLongitude = StationLongitude;
     }
     public double getStationLongitude() {
         return StationLongitude;
     }

    public void setWaveImageURI(String WaveImageURI) {
         this.WaveImageURI = WaveImageURI;
     }
     public String getWaveImageURI() {
         return WaveImageURI;
     }

}