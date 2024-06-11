package demo_makerthon.controller;

import demo_makerthon.mapper.UtilsMapper;
import demo_makerthon.pojo.Result;
import demo_makerthon.service.BoxService;
import demo_makerthon.service.ImageService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

@Slf4j
@RequestMapping
@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;
    @Autowired
    private BoxService boxService;
    @Autowired
    private UtilsMapper utilsMapper;

    @CrossOrigin(origins = "*")
    @PostMapping("/uploadImage")
    public Result uploadImage(@RequestParam("image") String base64Image, HttpServletRequest request) {

        String clientIpAddress = request.getRemoteAddr();
        //get the relatedId
        Integer relateId = utilsMapper.checkIp(clientIpAddress);

        imageService.saveImage(base64Image, relateId);

        boxService.setUpdateTime();
        return Result.success();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/downloadImage/{id}")
    public Result downloadImage(@PathVariable Integer id) {

        return Result.success(imageService.getImage(id));
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/downloadImage/{id}/{page}")
    public Result downloadImageByPage(@PathVariable Integer id,@PathVariable Integer page) {

        return Result.success(imageService.getImageByPage(id, page));
    }
}
