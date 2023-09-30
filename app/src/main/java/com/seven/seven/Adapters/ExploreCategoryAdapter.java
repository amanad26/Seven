package com.seven.seven.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seven.seven.Models.ExploreCategoryModel;
import com.seven.seven.R;
import com.seven.seven.databinding.ExploreCategoryLayoutBinding;

import java.util.List;
import java.util.Random;

public class ExploreCategoryAdapter extends RecyclerView.Adapter<ExploreCategoryAdapter.ViewHolder> {

    Context context;
    List<ExploreCategoryModel> models;

    public ExploreCategoryAdapter(Context context, List<ExploreCategoryModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.explore_category_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        if (position == 0)
            holder.binding.cardview.setCardBackgroundColor(context.getResources().getColor(R.color.pink));
        else if (position == 1)
            holder.binding.cardview.setCardBackgroundColor(context.getResources().getColor(R.color.teal));
        else if (position == 2)
            holder.binding.cardview.setCardBackgroundColor(context.getResources().getColor(R.color.orange));
        else if (position == 3)
            holder.binding.cardview.setCardBackgroundColor(context.getResources().getColor(R.color.purple));

        holder.binding.text.setText(models.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ExploreCategoryLayoutBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ExploreCategoryLayoutBinding.bind(itemView);
        }
    }

}
