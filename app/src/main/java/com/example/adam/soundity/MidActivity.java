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

        System.out.println("test on stage 2");
    }
}
