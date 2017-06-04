package com.sajkaan.device;

import com.sajkaan.control.Control;
import com.sajkaan.core.BaseEntity;
import com.sajkaan.room.Room;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Device extends BaseEntity {
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private Room room;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Control> controls;

    protected Device() {
        super();
        controls = new ArrayList<>();
    }

    public Device(String name) {
        this();
        this.name = name;
    }

    public void addControl(Control control) {
        control.setDevice(this);
        controls.add(control);
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

}
