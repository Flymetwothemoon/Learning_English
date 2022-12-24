package com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learning_english.R;

import java.util.List;

public class BannerAdapter extends com.youth.banner.adapter.BannerAdapter<banner,BannerAdapter.ViewHolder> {
    Context context;
    public BannerAdapter(Context context,List<banner> datas) {
        super(datas);
        this.context = context;
    }

    @Override
    public ViewHolder onCreateHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_banner,parent,false));
    }

    @Override
    public void onBindView(ViewHolder holder, banner data, int position, int size) {
        holder.mImageView.setImageResource(data.getImage());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image);
        }
    }
}
