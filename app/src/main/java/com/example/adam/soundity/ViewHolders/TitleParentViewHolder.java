package com.example.adam.soundity.ViewHolders;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;
import com.example.adam.soundity.R;

public class TitleParentViewHolder extends ParentViewHolder{

    public TextView _textView;
    public TextView _instrument;
    public TextView _level;
    public ImageButton _imageButton;

    public TitleParentViewHolder(View itemView) {
        super(itemView);
        _textView = (TextView) itemView.findViewById(R.id.parentTitle);
        _instrument = (TextView) itemView.findViewById(R.id.parentInstrument);
        _level = (TextView) itemView.findViewById(R.id.parentLevel);
        _imageButton = (ImageButton) itemView.findViewById(R.id.expandArrow);
    }

}
