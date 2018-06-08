package com.example.adam.soundity.ListModel;

import android.content.Context;

import com.example.adam.soundity.DataModel.Announcement;
import com.example.adam.soundity.Database.MockDatabase;

import java.util.ArrayList;
import java.util.List;

public class TitleCreator {
    static  TitleCreator _titleCreator;
    List<TitleParent> _titleParents;

    public TitleCreator(Context context){
        _titleParents = new ArrayList<>();

        for (Announcement announcement : MockDatabase.getAnnouncements()){
            _titleParents.add(new TitleParent(announcement));
        }
    }

    public static TitleCreator get(Context context){

        if (_titleCreator == null)
            _titleCreator = new TitleCreator(context);
        return _titleCreator;
    }

    public List<TitleParent> getAll() {
        return _titleParents;
    }
}
