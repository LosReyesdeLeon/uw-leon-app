package edu.tacoma.uw.set.css.dpeevy.uwleonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NavigationPage extends AppCompatActivity {

    private String hostFamilyAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hostFamilyAddress = null;
        setContentView(R.layout.navigation_page);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}