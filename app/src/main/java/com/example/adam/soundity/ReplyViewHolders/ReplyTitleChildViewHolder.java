package com.example.adam.soundity.ReplyViewHolders;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.example.adam.soundity.AppMemory.AppMemory;
import com.example.adam.soundity.DataModel.Announcement;
import com.example.adam.soundity.DataModel.Reply;
import com.example.adam.soundity.Database.MockDatabase;
import com.example.adam.soundity.R;

public class ReplyTitleChildViewHolder extends ChildViewHolder {

    public TextView option1, option2;
    public ReplyTitleChildViewHolder(View itemView) {
        super(itemView);
        option1 = (TextView)itemView.findViewById(R.id.option1);
        option2 = (TextView)itemView.findViewById(R.id.option2);

    }
}
