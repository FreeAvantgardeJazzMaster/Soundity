package com.example.adam.soundity.ListModel;

import com.example.adam.soundity.DataModel.Announcement;

public class TitleChild{

    public String option1;
    public String option2;
    private int announcementID;

    public TitleChild(Announcement announcement) {
        this.option1 = announcement.getUsername();
        this.option2 = announcement.getContent();
        this.announcementID = announcement.getId();
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public int getAnnouncementID() {
        return announcementID;
    }

    public void setAnnouncementID(int announcementID) {
        this.announcementID = announcementID;
    }
}
