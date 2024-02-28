package demo_makerthon.service.impl;

import demo_makerthon.mapper.DemoMapper;
import demo_makerthon.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoMapper demoMapper;

    @Override
    public int demoTest(int num) {

        return 0;
    }

    @Override
    public LocalDateTime demoTimeTest() {
        return LocalDateTime.now();
    }
}
