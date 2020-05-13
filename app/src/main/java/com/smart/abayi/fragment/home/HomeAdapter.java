package com.smart.abayi.fragment.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.smart.abayi.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder>{

    private ArrayList<HomeItem> list;

    public HomeAdapter(ArrayList<HomeItem> mlist){
        list = mlist;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_home_cardview, parent, false);
        HomeViewHolder homeViewHolder = new HomeViewHolder(view);
        return homeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        HomeItem item = list.get(position);
        holder.imageView.setImageResource(R.drawable.kz);
        holder.textTitle.setText(item.getTitle());
        holder.textComment.setText(String.valueOf(item.getCountComment()));
        holder.textData.setText(item.getData());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class HomeViewHolder extends RecyclerView.ViewHolder {
        public TextView textTitle;
        public TextView textData;
        public TextView textComment;
        public ImageView imageView;

        public HomeViewHolder(@NonNull final View itemView) {
            super(itemView);
            textTitle = itemView.findViewById(R.id.textTitle);
            textData = itemView.findViewById(R.id.textData);
            textComment = itemView.findViewById(R.id.textCommentCount);
            imageView = itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Toast.makeText(itemView.getContext(), "Click: " +getAdapterPosition(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}
