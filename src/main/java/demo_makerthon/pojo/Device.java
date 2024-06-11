package demo_makerthon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Device {
    String deviceName;
    LocalDateTime LastUpdated;
    LocalDateTime ActivationDate;
    Integer id;
    String ipAddress;
}
