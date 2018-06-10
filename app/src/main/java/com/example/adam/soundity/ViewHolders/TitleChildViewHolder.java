package com.example.adam.soundity.ViewHolders;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.example.adam.soundity.AppMemory.AppMemory;
import com.example.adam.soundity.DataModel.Announcement;
import com.example.adam.soundity.DataModel.Reply;
import com.example.adam.soundity.Database.MockDatabase;
import com.example.adam.soundity.R;

public class TitleChildViewHolder extends ChildViewHolder {

    public TextView option1, option2;
    public CardView interesteButton;
    private int announcementID;
    public TitleChildViewHolder(View itemView) {
        super(itemView);
        option1 = (TextView)itemView.findViewById(R.id.option1);
        option2 = (TextView)itemView.findViewById(R.id.option2);
        interesteButton = (CardView) itemView.findViewById(R.id.interestedButton);

        interesteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Announcement announcement = MockDatabase.getAnnouncementByID(announcementID);
                MockDatabase.addUserByIdReply(new Reply(announcement, AppMemory.getCuurentUser()), announcement.getUserId());
            }
        });
    }

    public int getAnnouncementID() {
        return announcementID;
    }

    public void setAnnouncementID(int announcementID) {
        this.announcementID = announcementID;
    }
}
