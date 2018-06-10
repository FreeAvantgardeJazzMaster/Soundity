package com.example.adam.soundity.DataModel;

import com.example.adam.soundity.Database.MockDatabase;

public class Announcement {

    private int id;
    private Genre genre;
    private String instrument;
    private Level level;
    private int userId;
    private String content;
    private String username;
    private Location location;

    public Announcement(int id, Genre genre, String instrument, Level level, int userId, String content, Location location) {
        this.id = id;
        this.location = location;
        this.genre = genre;
        this.instrument = instrument;
        this.level = level;
        this.userId = userId;
        this.content = content;
        this.username = MockDatabase.getUserById(userId).getUsername();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
