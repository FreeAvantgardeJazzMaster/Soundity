package com.example.adam.soundity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mid);
    }

    public void showAnnouncementsList(View view){
        Intent intent = new Intent(this, AnnouncementListActivity.class);
        startActivity(intent);
        System.out.println("here");
    }

    public void showAddAnnouncement(View view){
        Intent intent = new Intent(this, AddAnnouncement.class);
        startActivity(intent);
    }

    public void showSettings(View view){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void showMessages(View view){
        Intent intent = new Intent(this, Messages.class);
        startActivity(intent);
    }
}
