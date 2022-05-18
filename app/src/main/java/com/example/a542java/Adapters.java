package com.example.a542java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class Adapters extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<VedioImage> list;
    Context context;

    public Adapters(ArrayList<VedioImage> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_vedios, parent, false);
        return new MyImageVedios(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VedioImage vedioImage = list.get(position);
        if (holder instanceof MyImageVedios) {
            ((MyImageVedios) holder).imageView.setImageResource(vedioImage.image);
            ((MyImageVedios) holder).shapeableImageView.setImageResource(vedioImage.roundImage);
            ((MyImageVedios) holder).textView.setText(vedioImage.addStories);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyImageVedios extends RecyclerView.ViewHolder {
        ImageView imageView;
        ShapeableImageView shapeableImageView;
        TextView textView;

        public MyImageVedios(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_fullscren1);
            shapeableImageView = itemView.findViewById(R.id.image_shape1);
            textView = itemView.findViewById(R.id.stories_id1);
        }
    }
}
