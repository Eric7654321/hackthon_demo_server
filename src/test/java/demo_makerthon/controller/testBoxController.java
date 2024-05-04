package demo_makerthon.controller;

import demo_makerthon.service.BoxService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class testBoxController {

    @Autowired
    private BoxController boxController;
    @Autowired
    private BoxService boxService;

    @Test
    public void testBoxController(){
        System.out.println(boxController.getMagnitude());
    }
    @Test
    public void SetBoxTime(){
        boxService.setUpdateTime();
    }
}
