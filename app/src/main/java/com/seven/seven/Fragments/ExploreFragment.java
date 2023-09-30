package com.seven.seven.Fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seven.seven.Adapters.ExploreCategoryAdapter;
import com.seven.seven.Adapters.ExploreVideoAdapter;
import com.seven.seven.Models.ExploreCategoryModel;
import com.seven.seven.Models.ExploreVideoModel;
import com.seven.seven.R;
import com.seven.seven.databinding.FragmentExploreBinding;

import java.util.ArrayList;
import java.util.List;

public class ExploreFragment extends Fragment {

    public ExploreFragment() {
        // Required empty public constructor
    }

    private FragmentExploreBinding binding;
    private Activity activity;
    private List<ExploreCategoryModel> models  = new ArrayList<>();
    private  List<ExploreVideoModel>  exploreVideoModels = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentExploreBinding.inflate(getLayoutInflater());

        activity = requireActivity();


        return binding.getRoot();

    }

    @Override
    public void onResume() {
        super.onResume();
        setExploreData();
        setCategoryVideo();
    }

    private  void setExploreData(){

        models.add(new ExploreCategoryModel("Game"));
        models.add(new ExploreCategoryModel("Coronavirus News"));
        models.add(new ExploreCategoryModel("History"));
        models.add(new ExploreCategoryModel("Entertainment"));

        binding.categoryRecycler.setLayoutManager(new GridLayoutManager(activity, 2));
        binding.categoryRecycler.setAdapter(new ExploreCategoryAdapter(activity,models));


    }

    private  void setCategoryVideo(){
        exploreVideoModels.add(new ExploreVideoModel("10","Foods"));
        exploreVideoModels.add(new ExploreVideoModel("59","Games"));
        exploreVideoModels.add(new ExploreVideoModel("30","Entertainment"));
        exploreVideoModels.add(new ExploreVideoModel("60","Comedy"));


        binding.categoryDataRecycler.setLayoutManager(new LinearLayoutManager(activity));
        binding.categoryDataRecycler.setAdapter(new ExploreVideoAdapter(activity, exploreVideoModels));

    }

}