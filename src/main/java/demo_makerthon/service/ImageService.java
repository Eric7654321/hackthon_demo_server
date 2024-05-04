package demo_makerthon.service;

import demo_makerthon.pojo.Result;

public interface ImageService {
    public Result saveImage(String base64Image);

    public String getImage();
}
