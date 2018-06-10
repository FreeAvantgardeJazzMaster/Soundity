package com.example.adam.soundity.ReplyViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.example.adam.soundity.R;

public class ReplyTitleParentViewHolder extends ParentViewHolder{

    public TextView _textView;
    public TextView _fromUser;

    public ReplyTitleParentViewHolder(View itemView) {
        super(itemView);
        _textView = (TextView) itemView.findViewById(R.id.parentTitle);
        _fromUser = (TextView) itemView.findViewById(R.id.parentFromUser);

    }

}
