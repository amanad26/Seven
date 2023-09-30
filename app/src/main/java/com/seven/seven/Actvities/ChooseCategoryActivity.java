package com.seven.seven.Actvities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.seven.seven.Adapters.CategoryAdapter;
import com.seven.seven.Models.CategoryModel;
import com.seven.seven.R;
import com.seven.seven.databinding.ActivityChooseCategoryBinding;

import java.util.ArrayList;
import java.util.List;

public class ChooseCategoryActivity extends AppCompatActivity {

    private ChooseCategoryActivity activity;
    private ActivityChooseCategoryBinding binding;
    private List<CategoryModel> models = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        activity = this;

        binding.backBtn.setOnClickListener(view -> onBackPressed());

    }

    @Override
    protected void onResume() {
        super.onResume();
        setCategoryData();
    }

    private void setCategoryData() {

        models.add(new CategoryModel("Art", R.drawable.ic_art));
        models.add(new CategoryModel("Architecture", R.drawable.ic_articeture));
        models.add(new CategoryModel("Comedy", R.drawable.home_image));
        models.add(new CategoryModel("Entertainment", R.drawable.ic_art));
        models.add(new CategoryModel("News", R.drawable.ic_articeture));
        models.add(new CategoryModel("Business", R.drawable.ic_art));
        models.add(new CategoryModel("Music", R.drawable.ic_articeture));
        models.add(new CategoryModel("Live", R.drawable.ic_art));


        binding.reccylerView.setLayoutManager(new GridLayoutManager(activity, 2));
        binding.reccylerView.setAdapter(new CategoryAdapter(activity, models));
        binding.progressBAr.setVisibility(View.GONE);
    }

}