package edu.tacoma.uw.set.css.dpeevy.uwleonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

public class AboutLeonPage extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.about_leon_page);

            TextView textView = (TextView) findViewById(R.id.about);
            textView.setText("Welcome to the About page\n" +
                    "This is the About Page.\n" +
                    "     \tHighlights:\n" +
                    "     \tArt History\n" +
                    "           \t-Architecture\n" +
                    "           \t-Catholic Art\n" +
                    "     \tIntellectual History\n" +
                    "           \t-Astronauts\n" +
                    "           \t-Cyber Security Center\n" +
                    "     \tContemporary\n" +
                    "           \t-Bars and parties"); //set text for text view
        }
}