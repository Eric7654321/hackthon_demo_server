package demo_makerthon.service;

import demo_makerthon.pojo.Result;

public interface ImageService {
    public Result saveImage(String base64Image, Integer relateId);

    public String getImage(Integer id);
    public String getImageByPage(Integer id, Integer page);
}
