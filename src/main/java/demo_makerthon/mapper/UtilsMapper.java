package demo_makerthon.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.time.LocalDateTime;

@Mapper
public interface UtilsMapper {
    @Select("Select id from makentu2024.devices where ipAddress = #{ipAddress}")
    Integer checkIp(String ipAddress);

    @Insert("INSERT INTO makentu2024.devices (IPAddress, DeviceName, LastUpdated, ActivationDate) VALUES (#{ipAddress},#{name},now(),now())")
    void setDevice(String name, String ipAddress);

    @Update("UPDATE makentu2024.devices SET LastUpdated = NOW() WHERE IPAddress = #{ipAddress}")
    void setDeviceTime(String ipAddress);

}
