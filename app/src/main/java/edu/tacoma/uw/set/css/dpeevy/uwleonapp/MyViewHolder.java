package edu.tacoma.uw.set.css.dpeevy.uwleonapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView newsImage;
    TextView newsTitle, newsDate, newsButton;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        newsImage = itemView.findViewById(R.id.newsImage);
        newsTitle = itemView.findViewById(R.id.newsTitle);
        newsDate = itemView.findViewById(R.id.newsDate);
        newsButton = itemView.findViewById(R.id.newsButton);
    }
}
