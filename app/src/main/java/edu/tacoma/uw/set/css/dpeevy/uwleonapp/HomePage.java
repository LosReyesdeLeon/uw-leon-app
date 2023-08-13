package edu.tacoma.uw.set.css.dpeevy.uwleonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
    }

    @Override
    protected void onStart() {
        super.onStart();
//        Button b = findViewById(R.id.about_button);
//        setButtonListener(b, AboutLeonPage.class);
//
//        b = findViewById(R.id.navigation_button);
//        setButtonListener(b, NavigationPage.class);
    }

//    private void setButtonListener(Button button, Class<?> cls) {
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(getApplicationContext(), cls);
//                startActivity(i);
//            }
//        });
//    }
}