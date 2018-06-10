package com.example.adam.soundity.ListModel;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.adam.soundity.DataModel.Announcement;

import java.util.List;
import java.util.UUID;

public class AnnouncementTitleParent implements ParentObject {


    private List<Object> mChildrenList;
    private UUID _id;
    private String title;
    private String instrument;
    private String level;
    private String location;
    private Announcement announcement;

    public AnnouncementTitleParent(Announcement announcement) {
        this.title = announcement.getGenre().getName();
        _id = UUID.randomUUID();
        this.instrument = announcement.getInstrument();
        this.level = announcement.getLevel().getName();
        this.location = announcement.getLocation().getName();
        this.announcement = announcement;
    }

    public UUID get_id() {
        return _id;
    }

    public void set_id(UUID _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public List<Object> getChildObjectList() {
        return mChildrenList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        mChildrenList = list;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Announcement getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
