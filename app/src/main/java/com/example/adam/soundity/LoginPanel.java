package com.example.adam.soundity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.adam.soundity.AppMemory.AppMemory;
import com.example.adam.soundity.DataModel.User;
import com.example.adam.soundity.Database.MockDatabase;

import org.w3c.dom.Text;

public class LoginPanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_panel);
    }

    public void logIn(View view){
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        TextView loginError = (TextView) findViewById(R.id.loginError);

        for (User user : MockDatabase.getUsers()){
            if (user.getUsername().equals(username.getText().toString()) && user.getPassword().equals(password.getText().toString())){
                AppMemory.setCuurentUser(user);
                loginError.setVisibility(View.INVISIBLE);
                showMidActivity();
                break;
            }
            else {
                loginError.setVisibility(View.VISIBLE);
            }

        }
    }

    private void showMidActivity(){
        Intent intent = new Intent(this, MidActivity.class);
        startActivity(intent);
    }
}
