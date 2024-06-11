package demo_makerthon.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;

@Mapper
public interface ImageMapper {
    @Insert("insert into makentu2024.quackimage(pic, relateId, time) values(#{Img},#{relateId},#{time})")
    void insert(String Img, Integer relateId, LocalDateTime time);

    @Select("SELECT makentu2024.quackimage.pic FROM makentu2024.quackimage WHERE relateId = #{id} ORDER BY time DESC LIMIT 1")
    String select(Integer id);

    @Select("SELECT makentu2024.quackimage.pic FROM makentu2024.quackimage WHERE relateId = #{id} ORDER BY time DESC LIMIT 1 OFFSET #{offset - 1}")
    String selectByPage(Integer id, Integer offset);

}
