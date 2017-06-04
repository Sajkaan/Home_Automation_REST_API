package com.sajkaan.control;

import com.sajkaan.user.User;
import com.sajkaan.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleAfterSave;
import org.springframework.security.core.context.SecurityContextHolder;

public class ControlEventHandler {

    private final UserRepository users;

    @Autowired
    public ControlEventHandler(UserRepository users) {
        this.users = users;
    }

    @HandleAfterSave
    public void setLastModifiedAfterSave(Control control) {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = users.findByName(name);
        control.setLastModifiedBy(user);
    }
}
