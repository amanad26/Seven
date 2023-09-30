package com.seven.seven.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.seven.seven.Models.ExploreVideoModel;
import com.seven.seven.R;
import com.seven.seven.databinding.ExploreVideoLayoutBinding;

import java.util.List;

public class ExploreVideoAdapter extends RecyclerView.Adapter<ExploreVideoAdapter.ViewHolder>{

    Context context ;
    List<ExploreVideoModel> models ;

    public ExploreVideoAdapter(Context context, List<ExploreVideoModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.explore_video_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.binding.videoCount.setText(models.get(position).getCount());
        holder.binding.videoTitle.setText(models.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public  class  ViewHolder extends RecyclerView.ViewHolder{
        ExploreVideoLayoutBinding binding ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ExploreVideoLayoutBinding.bind(itemView);
        }
    }
}
