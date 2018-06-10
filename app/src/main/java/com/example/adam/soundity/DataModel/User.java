package com.example.adam.soundity.DataModel;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;

    private String username;

    private String password;

    private Location location;

    private List<Reply> replies = new ArrayList<>();

    public User(int id, String username, String password, Location location) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.location = location;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }
}
