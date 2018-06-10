package com.example.adam.soundity.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.adam.soundity.ListModel.TitleChild;
import com.example.adam.soundity.ListModel.TitleParent;
import com.example.adam.soundity.R;
import com.example.adam.soundity.ViewHolders.TitleChildViewHolder;
import com.example.adam.soundity.ViewHolders.TitleParentViewHolder;

import java.util.List;

public class MyAdapter extends ExpandableRecyclerAdapter<TitleParentViewHolder, TitleChildViewHolder>{

    LayoutInflater inflater;

    public MyAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public TitleParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.list_parent, viewGroup, false);
        return new TitleParentViewHolder(view);
    }

    @Override
    public TitleChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.list_child, viewGroup, false);
        return new TitleChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(TitleParentViewHolder titleParentViewHolder, int i, Object o) {
        TitleParent title = (TitleParent)o;
        titleParentViewHolder._textView.setText(title.getTitle());
        titleParentViewHolder._instrument.setText(title.getInstrument());
        titleParentViewHolder._level.setText(title.getLevel());
        titleParentViewHolder._location.setText(title.getLocation());

        switch (title.getLevel().toLowerCase()){
            case "low":
                titleParentViewHolder._level.setTextColor(Color.GREEN);
                break;
            case "medium":
                titleParentViewHolder._level.setTextColor(Color.BLUE);
                break;
            case "high":
                titleParentViewHolder._level.setTextColor(Color.YELLOW);
                break;
            case "pro":
                titleParentViewHolder._level.setTextColor(Color.RED);
                break;
        }
    }

    @Override
    public void onBindChildViewHolder(TitleChildViewHolder titleChildViewHolder, int i, Object o) {
        TitleChild title = (TitleChild)o;
        titleChildViewHolder.option1.setText(title.getOption1());
        titleChildViewHolder.option2.setText(title.getOption2());
        titleChildViewHolder.setAnnouncementID(title.getAnnouncementID());
    }
}
