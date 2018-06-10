package com.example.adam.soundity.ReplyListModel;

import android.content.Context;

import com.example.adam.soundity.AppMemory.AppMemory;
import com.example.adam.soundity.DataModel.Announcement;
import com.example.adam.soundity.DataModel.Reply;
import com.example.adam.soundity.Database.MockDatabase;

import java.util.ArrayList;
import java.util.List;

public class ReplyTitleCreator {
    static ReplyTitleCreator _titleCreator;
    List<ReplyTitleParent> _titleParents;

    public ReplyTitleCreator(Context context){
        _titleParents = new ArrayList<>();
        List<Reply> replies;
        if (( replies = MockDatabase.getUserByIdReplies(AppMemory.getCuurentUser().getId()) ) != null) {
            for (Reply reply : replies) {
                _titleParents.add(new ReplyTitleParent(reply));
            }
        }
    }

    public static ReplyTitleCreator get(Context context){

        //if (_titleCreator == null)
            _titleCreator = new ReplyTitleCreator(context);
        return _titleCreator;
    }

    public List<ReplyTitleParent> getAll() {
        return _titleParents;
    }
}
