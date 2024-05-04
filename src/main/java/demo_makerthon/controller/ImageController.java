package demo_makerthon.controller;

import demo_makerthon.pojo.Result;
import demo_makerthon.service.BoxService;
import demo_makerthon.service.ImageService;
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

    @PostMapping("/uploadImage")
    public Result uploadImage(@RequestParam("image") String base64Image) {
        imageService.saveImage(base64Image);
        boxService.setUpdateTime();
        return Result.success();
    }
    @GetMapping("/downloadImage")
    public Result downloadImage() {

        return Result.success(imageService.getImage());
    }
}
