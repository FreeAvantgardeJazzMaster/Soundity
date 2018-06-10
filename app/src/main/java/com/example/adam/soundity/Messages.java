package com.example.adam.soundity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.adam.soundity.Adapter.AnnouncementListAdapter;
import com.example.adam.soundity.Adapter.ReplyListAdapter;
import com.example.adam.soundity.ListModel.AnnouncementTitleChild;
import com.example.adam.soundity.ListModel.AnnouncementTitleCreator;
import com.example.adam.soundity.ListModel.AnnouncementTitleParent;
import com.example.adam.soundity.ReplyListModel.ReplyTitleChild;
import com.example.adam.soundity.ReplyListModel.ReplyTitleCreator;
import com.example.adam.soundity.ReplyListModel.ReplyTitleParent;

import java.util.ArrayList;
import java.util.List;

public class Messages extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        ((ReplyListAdapter) recyclerView.getAdapter()).onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        recyclerView = (RecyclerView) findViewById(R.id.myRecyclerViewReply);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ReplyListAdapter adapter = new ReplyListAdapter(this, initData());
        adapter.setParentClickableViewAnimationDefaultDuration();
        adapter.setParentAndIconExpandOnClick(true);

        recyclerView.setAdapter(adapter);
    }

    private List<ParentObject> initData() {
        ReplyTitleCreator titleCreator = ReplyTitleCreator.get(this);
        List<ReplyTitleParent> titles = titleCreator.getAll();
        List<ParentObject> parentObjects = new ArrayList<>();
        for (ReplyTitleParent title: titles) {
            List<Object> childList = new ArrayList<>();
            childList.add(new ReplyTitleChild(title.getReply()));
            title.setChildObjectList(childList);
            parentObjects.add(title);

        }
        return parentObjects;
    }
}
