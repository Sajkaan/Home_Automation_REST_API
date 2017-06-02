package com.sajkaan.room;

import com.sajkaan.core.BaseEntity;
import com.sajkaan.device.Device;
import com.sajkaan.user.User;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Room extends BaseEntity{
    private String name;
    private Integer area;
    @OneToMany
    List<Device> devices;

    List<User> administrators;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public List<User> getAdministrators() {
        return administrators;
    }

    public void setAdministrators(List<User> administrators) {
        this.administrators = administrators;
    }
}