package com.example.adam.soundity.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.example.adam.soundity.ListModel.AnnouncementTitleChild;
import com.example.adam.soundity.ListModel.AnnouncementTitleParent;
import com.example.adam.soundity.R;
import com.example.adam.soundity.ReplyListModel.ReplyTitleChild;
import com.example.adam.soundity.ReplyListModel.ReplyTitleParent;
import com.example.adam.soundity.ReplyViewHolders.ReplyTitleChildViewHolder;
import com.example.adam.soundity.ReplyViewHolders.ReplyTitleParentViewHolder;
import com.example.adam.soundity.ViewHolders.TitleChildViewHolder;
import com.example.adam.soundity.ViewHolders.TitleParentViewHolder;

import java.util.List;

public class ReplyListAdapter extends ExpandableRecyclerAdapter<ReplyTitleParentViewHolder, ReplyTitleChildViewHolder>{

    LayoutInflater inflater;

    public ReplyListAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ReplyTitleParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.reply_parent, viewGroup, false);
        return new ReplyTitleParentViewHolder(view);
    }

    @Override
    public ReplyTitleChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.reply_child, viewGroup, false);
        return new ReplyTitleChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(ReplyTitleParentViewHolder titleParentViewHolder, int i, Object o) {
        ReplyTitleParent title = (ReplyTitleParent)o;
        titleParentViewHolder._textView.setText("Answer from:");
        titleParentViewHolder._fromUser.setText(title.getFromUser());

    }

    @Override
    public void onBindChildViewHolder(ReplyTitleChildViewHolder titleChildViewHolder, int i, Object o) {
        ReplyTitleChild title = (ReplyTitleChild)o;
        titleChildViewHolder.option1.setText(title.getOption1());
        titleChildViewHolder.option2.setText(title.getOption2());
    }
}
