package com.laioffer.tinnews.ui.search;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.laioffer.tinnews.R;

import javax.annotation.Nonnull;

public class SearchNewsAdapter extends RecyclerView.Adapter<SearchNewsAdapter.SearchNewsViewHolder> {

    @Nonnull
    @Override
    public SearchNewsViewHolder onCreateViewHolder(@Nonnull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@Nonnull SearchNewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class SearchNewsViewHolder extends RecyclerView.ViewHolder {
        ImageView newsImage;
        ImageView favorite;

        public SearchNewsViewHolder(View itemView) {
            super(itemView);
            newsImage = itemView.findViewById(R.id.image);
            favorite = itemView.findViewById(R.id.favorite);
        }
    }
}
