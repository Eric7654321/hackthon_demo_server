package demo_makerthon.service.impl;

import demo_makerthon.service.UtilsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Service
public class UtilsServiceImpl implements UtilsService {
    @Override
    public String getHashName() {
        // 獲取當前時間
        LocalDateTime now = LocalDateTime.now();

        // 定義時間格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuuMMddHHmmssSSS");

        // 將時間轉換為字符串
        String timeString = now.format(formatter);

        // 檢查timeString的長度
        if (timeString.length() < 25) {
            return timeString;  // 如果長度不足，直接返回timeString
        }

        // 將字符串轉換為所需的格式
        String deviceName = timeString.substring(0, 5) + "-" +
                timeString.substring(5, 10) + "-" +
                timeString.substring(10, 15) + "-" +
                timeString.substring(15, 20) + "-" +
                timeString.substring(20, 25);

        return deviceName;
    }
}
