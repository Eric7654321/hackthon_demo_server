package demo_makerthon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MiniWeatherReport {
    private String locationName;
    private String weatherDescription;
    private String rainfallProbability;
    private String minTemperature;
    private String comfortIndex;
    private String maxTemperature;
}
