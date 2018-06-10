package com.example.adam.soundity.ReplyListModel;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.adam.soundity.DataModel.Announcement;
import com.example.adam.soundity.DataModel.Reply;

import java.util.List;
import java.util.UUID;

public class ReplyTitleParent implements ParentObject {


    private List<Object> mChildrenList;
    private UUID _id;
    private String fromUser;
    private Reply reply;

    public ReplyTitleParent(Reply reply) {
        _id = UUID.randomUUID();
        this.reply = reply;
        this.fromUser = reply.getFromUser().getUsername();
    }

    public UUID get_id() {
        return _id;
    }

    public void set_id(UUID _id) {
        this._id = _id;
    }

    @Override
    public List<Object> getChildObjectList() {
        return mChildrenList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        mChildrenList = list;
    }

    public Reply getReply() {
        return reply;
    }

    public void setReply(Reply reply) {
        this.reply = reply;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }
}
