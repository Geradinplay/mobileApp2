package com.example.myapplication2.ui.anime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication2.AnimeItem;
import com.example.myapplication2.R;

import java.util.List;

public class AnimeRecyclerViewAdapter extends RecyclerView.Adapter<AnimeRecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<AnimeItem> items;
    private OnItemClickListener listener;

    public AnimeRecyclerViewAdapter(Context context, List<AnimeItem> items) {this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_anime, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AnimeItem currentItem = items.get(position);

        Glide.with(context).load(currentItem.getPosterUri()).into(holder.posterImageView);

        if (currentItem.getName() != null && !currentItem.getName().isEmpty()) {
            holder.nameTextView.setText(currentItem.getName());
        } else {
            holder.nameTextView.setText(R.string.anime_name_default);
        }
        if (currentItem.getDescription() != null && !currentItem.getDescription().isEmpty()) {
            holder.descriptionTextView.setText(currentItem.getDescription());
        } else {
            holder.descriptionTextView.setText(R.string.anime_description_default);
        }

        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView posterImageView;
        TextView nameTextView;
        TextView descriptionTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            posterImageView = itemView.findViewById(R.id.anime_poster);
            nameTextView = itemView.findViewById(R.id.anime_name);
            descriptionTextView = itemView.findViewById(R.id.anime_description);
        }
    }
}
