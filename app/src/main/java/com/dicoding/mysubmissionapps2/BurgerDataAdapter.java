package com.dicoding.mysubmissionapps2;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BurgerDataAdapter extends RecyclerView.Adapter<BurgerDataAdapter.BurgerDataHolder> {
    private ArrayList<Food> listFood;

    public BurgerDataAdapter(ArrayList<Food> list) {
        this.listFood = list;
    }

    @NonNull
    @Override
    public BurgerDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_makanan, parent, false);
        return new BurgerDataHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final BurgerDataHolder holder, int position) {
        Food food = listFood.get(position);
        Glide.with(holder.itemView.getContext())
                .load(food.getPhotos())
                .into(holder.imgPhoto);
        holder.tvName.setText(food.getName());
        holder.tvDetail.setText(food.getDetail());
        holder.btnMoreDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(holder.itemView.getContext(), BurgerDetails.class);
                holder.itemView.getContext().startActivity(moveIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    public class BurgerDataHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        Button btnMoreDetail;

        public BurgerDataHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.image_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            btnMoreDetail = itemView.findViewById(R.id.btn_selengkapnya);
        }
    }
}
