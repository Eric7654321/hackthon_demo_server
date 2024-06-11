package demo_makerthon.mapper;

import demo_makerthon.pojo.Datas;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CO2Mapper {
    @Update("update makentu2024.datas set co2 = #{sum} where id = #{relateId}")
    void setCO2(Integer sum, Integer relateId);

    @Select("select * from makentu2024.datas where id = #{id}")
    Datas getCO2(Integer id);

    @Update("update makentu2024.datas set red = #{sum} where id = #{relateId}")
    void setRed(Integer sum, Integer relateId);
}
