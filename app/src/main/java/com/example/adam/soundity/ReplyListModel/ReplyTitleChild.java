package com.example.adam.soundity.ReplyListModel;

import com.example.adam.soundity.DataModel.Reply;

public class ReplyTitleChild {

    public String option1;
    public String option2;

    public ReplyTitleChild(Reply reply) {
        this.option1 = "Your announcement nr: ";
        this.option2 = reply.getAnnouncement().getId() + "";
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
}
