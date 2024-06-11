package demo_makerthon.mapper;

import demo_makerthon.controller.ImageController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class testMapper {
    @Autowired
    private UtilsMapper utilsMapper;

    @Test
    public void testUtilsSetIpAddress(){
        utilsMapper.setDevice("3D列印墨魚麵","127.11.45.14");
    }
    @Test
    public void testUtilsSetTimeByIpAddress(){
        utilsMapper.setDeviceTime("0.0.0.0", LocalDateTime.now());
    }
}
