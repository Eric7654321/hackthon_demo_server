package demo_makerthon.service;

import demo_makerthon.pojo.Device;
import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public interface BoxService {
    void setUpdateTime();

    List<Device> getDevice();
}
