package com.example.adam.soundity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.adam.soundity.Adapter.MyAdapter;
import com.example.adam.soundity.Model.TitleChild;
import com.example.adam.soundity.Model.TitleCreator;
import com.example.adam.soundity.Model.TitleParent;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementListActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ((MyAdapter) recyclerView.getAdapter()).onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcement_list);

        recyclerView = (RecyclerView) findViewById(R.id.myRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter = new MyAdapter(this, initData());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);

        recyclerView.setAdapter(adapter);
    }

    private List<ParentObject> initData() {
        TitleCreator titleCreator = TitleCreator.get(this);
        List<TitleParent> titles = titleCreator.getAll();
        List<ParentObject> parentObjects = new ArrayList<>();
        for (TitleParent title: titles) {
            List<Object> childList = new ArrayList<>();
            childList.add(new TitleChild("Kamil", "Hi there! I'm looking for someone who can play trumpet and is not afraid of social meetings with others. Just want to have fun, and take as much as possible!" +
                    "See u at my garage!"));
            title.setChildObjectList(childList);
            parentObjects.add(title);

        }
        return parentObjects;
    }
}
