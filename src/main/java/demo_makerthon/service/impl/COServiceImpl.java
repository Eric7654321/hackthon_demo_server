package demo_makerthon.service.impl;

import demo_makerthon.mapper.CO2Mapper;
import demo_makerthon.pojo.Datas;
import demo_makerthon.service.CO2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class COServiceImpl implements CO2Service {
    @Autowired
    private CO2Mapper co2Mapper;

    @Override
    public void setCo2(Integer sum, Integer relateId) {
        co2Mapper.setCO2(sum, relateId);
    }

    @Override
    public Datas getCo2(Integer id) {
        Datas datas = co2Mapper.getCO2(id);
        return datas;
    }

    @Override
    public void setRed(Integer sum, Integer relateId) {
        co2Mapper.setRed(sum, relateId);
    }
}
