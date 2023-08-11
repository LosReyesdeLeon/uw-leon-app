package edu.tacoma.uw.set.css.dpeevy.uwleonapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private Context context;
    private List<NewsArticle> dataList;
    public void setSearchList(List<NewsArticle> dataSearchList){
        this.dataList = dataSearchList;
        notifyDataSetChanged();
    }
    public NewsAdapter(Context context, List<NewsArticle> dataList){
        this.context = context;
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_news, parent, false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.newsImage.setImageResource(dataList.get(position).getDataImage());
        holder.newsTitle.setText(dataList.get(position).getDataTitle());
        holder.newsDate.setText(dataList.get(position).getDataDate());
        holder.newsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, NewsDetail.class);
                intent.putExtra("Image", dataList.get(holder.getAdapterPosition()).getDataImage());
                intent.putExtra("Title", dataList.get(holder.getAdapterPosition()).getDataTitle());
                intent.putExtra("Date", dataList.get(holder.getAdapterPosition()).getDataTitle());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
