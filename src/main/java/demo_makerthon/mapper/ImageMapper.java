package demo_makerthon.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;

@Mapper
public interface ImageMapper {
    @Insert("insert into makentu2024.quackimage(pic, time) values(#{Img},#{time})")
    void insert(String Img, LocalDateTime time);

    @Select("select makentu2024.quackimage.pic from makentu2024.quackimage order by id desc limit 1")
    String select();
}
