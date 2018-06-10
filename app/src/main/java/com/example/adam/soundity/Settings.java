package com.example.adam.soundity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.adam.soundity.AppMemory.AppMemory;
import com.example.adam.soundity.Database.MockDatabase;

public class Settings extends AppCompatActivity {

    private Spinner locationSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        initFields();
    }

    public void showDemoMessage(View view){
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        dlgAlert.setMessage("This function is not available in demo.");
        dlgAlert.setTitle("Demo");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the dialog
                    }
                });

    }

    public Spinner getLocationSpinner() {
        return locationSpinner;
    }

    public void setLocationSpinner(Spinner locationSpinner) {
        this.locationSpinner = locationSpinner;
    }

    private void initFields(){
        initControls();

        ArrayAdapter<String> genreSpinnerAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, MockDatabase.getLocationsNames());
        locationSpinner.setAdapter(genreSpinnerAdapter);

        locationSpinner.setSelection(AppMemory.getCuurentUser().getLocation().getId());

    }

    private void initControls(){
        locationSpinner = (Spinner) findViewById(R.id.locationSpinner);
    }


}
