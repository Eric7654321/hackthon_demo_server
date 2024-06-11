package demo_makerthon.service;

import demo_makerthon.pojo.Datas;

public interface CO2Service {
    void setCo2(Integer sum, Integer relateId);

    Datas getCo2(Integer id);

    void setRed(Integer sum, Integer relateId);
}
