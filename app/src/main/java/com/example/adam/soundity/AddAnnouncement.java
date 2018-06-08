package com.example.adam.soundity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.adam.soundity.AppMemory.AppMemory;
import com.example.adam.soundity.DataModel.Announcement;
import com.example.adam.soundity.DataModel.Genre;
import com.example.adam.soundity.DataModel.Level;
import com.example.adam.soundity.Database.MockDatabase;

import java.util.ArrayList;
import java.util.List;

public class AddAnnouncement extends AppCompatActivity {

    private Spinner genreSpinner ;
    private Spinner levelSpinner;
    private TextView name;
    private EditText instrument;
    private EditText content;

    public Spinner getGenreSpinner() {
        return genreSpinner;
    }

    public void setGenreSpinner(Spinner genreSpinner) {
        this.genreSpinner = genreSpinner;
    }

    public Spinner getLevelSpinner() {
        return levelSpinner;
    }

    public void setLevelSpinner(Spinner levelSpinner) {
        this.levelSpinner = levelSpinner;
    }

    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_announcement);
        initFields();
    }


    public void post_OnClick(View view){
        postAd();

    }

    private void postAd(){
        if (isAddFilled()){
            Genre genre = MockDatabase.getGenreByName(genreSpinner.getSelectedItem().toString());
            Level level = MockDatabase.getLevelByName(levelSpinner.getSelectedItem().toString());
            MockDatabase.addAnnouncement(new Announcement(0, genre, instrument.getText().toString(), level, AppMemory.getCuurentUser().getId(), content.getText().toString()));
        }
    }

    private void initFields(){
        initControls();

        ArrayAdapter<String> genreSpinnerAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, MockDatabase.getGenresNames());
        genreSpinner.setAdapter(genreSpinnerAdapter);

        ArrayAdapter<String> levelSpinnerAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, MockDatabase.getLevelsNames());
        levelSpinner.setAdapter(levelSpinnerAdapter);

        name.setText(AppMemory.getCuurentUser().getUsername());
    }

    private void initControls(){
        genreSpinner = (Spinner) findViewById(R.id.genreSpinner);
        levelSpinner = (Spinner) findViewById(R.id.levelSpinner);
        name = (TextView) findViewById(R.id.name);
        instrument = (EditText) findViewById(R.id.instrument);
        content = (EditText) findViewById(R.id.content);
    }

    private boolean isAddFilled(){
        if (name.getText().toString().equals(""))
            return false;
        if (instrument.getText().toString().equals(""))
            return false;
        if (content.getText().toString().equals(""))
            return false;

        return true;
    }
}
