package demo_makerthon.mapper;

import demo_makerthon.pojo.Device;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.time.LocalDateTime;

@Mapper
public interface BoxMapper {
    //114514
    @Update("UPDATE makentu2024.devices set LastUpdated = #{localDateTime} where id = 1")
    void setDeviceUpdateTime(LocalDateTime localDateTime);

    //一次取全部
    @Select("Select devicename, lastupdated, activationdate, id, ipAddress from makentu2024.devices")
    Device getDevice();
}
