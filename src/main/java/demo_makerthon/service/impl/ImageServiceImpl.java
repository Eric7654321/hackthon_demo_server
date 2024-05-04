package demo_makerthon.service.impl;

import demo_makerthon.mapper.ImageMapper;
import demo_makerthon.pojo.Result;
import demo_makerthon.service.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Slf4j
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageMapper imageMapper;

    @Override
    @Transactional
    public Result saveImage(String base64Image) {
        imageMapper.insert(base64Image, LocalDateTime.now());
        return Result.success();
    }

    @Override
    @Transactional
    public String getImage() {

        return imageMapper.select();
    }
}
