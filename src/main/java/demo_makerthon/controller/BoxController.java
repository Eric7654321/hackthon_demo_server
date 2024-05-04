package demo_makerthon.controller;

import demo_makerthon.pojo.Device;
import demo_makerthon.pojo.MiniReport;
import demo_makerthon.pojo.Result;
import demo_makerthon.service.BoxService;
import demo_makerthon.service.DemoService;
import demo_makerthon.service.EarthquackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RequestMapping
@RestController
public class BoxController {
    @Autowired
    private BoxService boxService;
    @Autowired
    private EarthquackService earthquackService;

    @GetMapping("/data/alert")
    public Result getMagnitude(){
        log.info("getMagnitude已被呼叫");
        System.out.println("getMagnitude已被呼叫");

        List<MiniReport> list = earthquackService.quakeSearch();

        return Result.success(list);
    }
    @GetMapping("/search")
    public Result getBoxInfo(){
        log.info("取得裝置資訊");
        Device device = boxService.getDevice();
        return Result.success(device);
    }


}
