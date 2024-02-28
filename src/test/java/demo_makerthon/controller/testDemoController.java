package demo_makerthon.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class testDemoController {

    @Autowired
    private DemoController demoController;

    @Test
    public void testDemoController(){
        int i = demoController.demoTest();
        System.out.println(i);
    }

    @Test
    public void testDemoTest2(){
        demoController.demoTest2();
    }

    @Test
    public void testDemoTestTime(){
        System.out.println(demoController.demoTestTime());
    }
}
