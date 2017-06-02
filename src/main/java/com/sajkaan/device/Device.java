package com.sajkaan.device;

import com.sajkaan.control.Control;
import com.sajkaan.room.Room;

import javax.persistence.ManyToOne;
import java.util.List;

public class Device {
    private String name;
    @ManyToOne
    private Room room;

    private List<Control> controls;

    public Device() {
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

    public void setControls(List<Control> controls) {
        this.controls = controls;
    }
}
