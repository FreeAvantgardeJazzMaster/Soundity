package com.example.adam.soundity.ListModel;

import android.content.Context;

import com.example.adam.soundity.AppMemory.AppMemory;
import com.example.adam.soundity.DataModel.Announcement;
import com.example.adam.soundity.Database.MockDatabase;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementTitleCreator {
    static AnnouncementTitleCreator _titleCreator;
    List<AnnouncementTitleParent> _titleParents;

    public AnnouncementTitleCreator(Context context){
        _titleParents = new ArrayList<>();

        for (Announcement announcement : MockDatabase.getAnnouncements()){
            if (announcement.getUserId() != AppMemory.getCuurentUser().getId())
                if (announcement.getLocation() == AppMemory.getCuurentUser().getLocation())
                _titleParents.add(new AnnouncementTitleParent(announcement));
        }
    }

    public static AnnouncementTitleCreator get(Context context){

        //if (_titleCreator == null)
            _titleCreator = new AnnouncementTitleCreator(context);
        return _titleCreator;
    }

    public List<AnnouncementTitleParent> getAll() {
        return _titleParents;
    }
}
