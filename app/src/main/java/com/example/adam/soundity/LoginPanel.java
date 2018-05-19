package com.example.adam.soundity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginPanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_panel);
    }

    public void showMidPanel(View view){
        Intent intent = new Intent(this, MidActivity.class);
        startActivity(intent);

        System.out.println("test");
    }
}
