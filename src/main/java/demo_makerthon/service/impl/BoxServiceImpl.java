package demo_makerthon.service.impl;

import demo_makerthon.mapper.BoxMapper;
import demo_makerthon.mapper.DemoMapper;
import demo_makerthon.pojo.Device;
import demo_makerthon.service.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BoxServiceImpl implements BoxService {
    @Autowired
    private BoxMapper boxMapper;

    @Override
    public void setUpdateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();

        boxMapper.setDeviceUpdateTime(localDateTime);
    }

    @Override
    public List<Device> getDevice() {
        List<Device> devices = boxMapper.getDevice();
        return devices;
    }

}
