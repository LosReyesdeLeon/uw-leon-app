package edu.tacoma.uw.set.css.dpeevy.uwleonapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
public class NewsDetail extends AppCompatActivity {
    TextView detailDesc, detailTitle;
    ImageView detailImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);
//        detailDesc = findViewById(R.id.detailDesc);
//        detailTitle = findViewById(R.id.detailTitle);
//        detailImage = findViewById(R.id.detailImage);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            detailDesc.setText(bundle.getInt("Desc"));
            detailImage.setImageResource(bundle.getInt("Image"));
            detailTitle.setText(bundle.getString("Title"));
        }
    }
}