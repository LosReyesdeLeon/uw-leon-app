package edu.tacoma.uw.set.css.dpeevy.uwleonapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyNewsRecyclerViewAdapter extends RecyclerView.Adapter<MyNewsRecyclerViewAdapter.ViewHolder> {


    private final List<News> mValues;
    public MyNewsRecyclerViewAdapter(List<News
            > newsList) {
        mValues = newsList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.fragment_news, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.setItem(mValues.get(position));
    }
    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        //public FragmentNewsBinding binding;
        public edu.tacoma.uw.set.css.dpeevy.uwleonapp.News mItem;
        public ViewHolder(View view) {
            super(view);
            mView = view;
            //binding = FragmentNewsBinding.bind(view);
        }
        public void setItem(final News item) {
//            mItem = item;
//            binding.itemId.setText(new Integer(item.getId()).toString());
//            binding.content.setText(item.getName());
//            binding.content.setOnClickListener(view -> {
//                AnimalListFragmentDirections.ActionAnimalListFragmentToAnimalDetailFragment directions =
//                        AnimalListFragmentDirections.actionAnimalListFragmentToAnimalDetailFragment(item);
//                Navigation.findNavController(view)
//                        .navigate(directions);
//            });
        }
    }
}





