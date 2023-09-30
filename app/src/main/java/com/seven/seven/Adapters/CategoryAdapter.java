package com.seven.seven.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seven.seven.Models.CategoryModel;
import com.seven.seven.R;
import com.seven.seven.databinding.CategoryItemLayoutBinding;

import java.util.List;
import java.util.Random;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>{

    Context context ;
    List<CategoryModel> models ;

    public CategoryAdapter(Context context, List<CategoryModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new ViewHolder(LayoutInflater.from(context).inflate(R.layout.category_item_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256) );
        holder.binding.cardview.setCardBackgroundColor(color);

        holder.binding.image.setImageResource(models.get(position).getImage());
        holder.binding.text.setText(models.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder{
        CategoryItemLayoutBinding binding ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = CategoryItemLayoutBinding.bind(itemView);
        }
    }
}
