package demo_makerthon.controller;

import demo_makerthon.mapper.UtilsMapper;
import demo_makerthon.pojo.Datas;
import demo_makerthon.pojo.Result;
import demo_makerthon.service.CO2Service;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.relation.RelationSupport;

@Slf4j
@RequestMapping
@RestController
public class CO2Controller {
    @Autowired
    CO2Service co2Service;
    @Autowired
    UtilsMapper utilsMapper;

    @CrossOrigin(origins = "*")
    @GetMapping("/setCo2/{sum}")
    public Result setCO2(@PathVariable Integer sum, HttpServletRequest request) {
        String clientIpAddress = request.getRemoteAddr();
        //get the relatedId
        Integer relateId = utilsMapper.checkIp(clientIpAddress);

        co2Service.setCo2(sum, relateId);
        return Result.success();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/getCo2/{id}")
    public Result getCO2ById(@PathVariable Integer id) {

        Datas datas = co2Service.getCo2(id);
        return Result.success(datas);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/setRed/{sum}")
    public Result setRed(@PathVariable Integer sum, HttpServletRequest request) {
        String clientIpAddress = request.getRemoteAddr();
        //get the relatedId
        Integer relateId = utilsMapper.checkIp(clientIpAddress);

        co2Service.setRed(sum, relateId);
        return Result.success();
    }
}
