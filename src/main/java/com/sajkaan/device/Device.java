package com.sajkaan.device;

import com.sajkaan.control.Control;
import com.sajkaan.core.BaseEntity;
import com.sajkaan.room.Room;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class Device extends BaseEntity{
    private String name;

    @ManyToOne
    private Room room;

    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL)
    private List<Control> controls;

    protected Device() {
        super();
        controls = new ArrayList<>();
    }

    public Device(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Control> getControls() {
        return controls;
    }


    public void addControl(Control control) {
        control.setDevice(this);
        controls.add(control);
    }
}
