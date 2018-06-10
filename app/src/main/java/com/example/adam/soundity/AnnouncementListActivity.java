package com.example.adam.soundity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.adam.soundity.Adapter.AnnouncementListAdapter;
import com.example.adam.soundity.ListModel.AnnouncementTitleChild;
import com.example.adam.soundity.ListModel.AnnouncementTitleCreator;
import com.example.adam.soundity.ListModel.AnnouncementTitleParent;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementListActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ((AnnouncementListAdapter) recyclerView.getAdapter()).onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcement_list);

        recyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AnnouncementListAdapter adapter = new AnnouncementListAdapter(this, initData());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);

        recyclerView.setAdapter(adapter);
    }

    private List<ParentObject> initData() {
        AnnouncementTitleCreator titleCreator = AnnouncementTitleCreator.get(this);
        List<AnnouncementTitleParent> titles = titleCreator.getAll();
        List<ParentObject> parentObjects = new ArrayList<>();
        for (AnnouncementTitleParent title: titles) {
            List<Object> childList = new ArrayList<>();
            childList.add(new AnnouncementTitleChild(title.getAnnouncement()));
            title.setChildObjectList(childList);
            parentObjects.add(title);

        }
        return parentObjects;
    }
}
