package demo_makerthon.controller;

import demo_makerthon.pojo.Result;
import demo_makerthon.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Slf4j
@RequestMapping
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/fuck")
    public int demoTest(){
        log.info("Hello world!");
        System.out.println("hello world!!!");
        return 114514;
    }

    @GetMapping("/test2")
    public Result demoTest2(){
        log.info("test2已被呼叫");
        System.out.println("test2已被呼叫");
        return Result.success();
    }

    @PostMapping("/time")
    public Result demoTestTime(){
        log.info("demoTestTime已被呼叫");
        System.out.println("demoTestTime已被呼叫");
        LocalDateTime time = demoService.demoTimeTest();
        return Result.success(time);
    }

    @GetMapping("/input/{num}")
    public Result demoNumTest(@PathVariable Integer num){
        log.info("成功傳入數字: {}",num);
        System.out.println("成功傳入數字: " + num);
        return Result.success(num);
    }

}
