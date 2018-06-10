package com.example.adam.soundity.DataModel;

public class Reply {
    private Announcement announcement;
    private User fromUser;

    public Announcement getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }

    public User getFromUser() {
        return fromUser;
    }

    public void setFromUser(User fromUser) {
        this.fromUser = fromUser;
    }

    public Reply(Announcement announcement, User fromUser) {
        this.announcement = announcement;
        this.fromUser = fromUser;
    }
}
