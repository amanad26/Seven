package com.seven.seven.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seven.seven.Actvities.ChooseCategoryActivity;
import com.seven.seven.Adapters.HomeListAdapter;
import com.seven.seven.Models.HomeListModel;
import com.seven.seven.R;
import com.seven.seven.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    Activity activity;
    List<HomeListModel> models = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(getLayoutInflater());

        activity = requireActivity();

        models.add(new HomeListModel("Aman"));
        models.add(new HomeListModel("Aman"));
        models.add(new HomeListModel("Aman"));
        models.add(new HomeListModel("Aman"));
        models.add(new HomeListModel("Aman"));
        models.add(new HomeListModel("Aman"));
        models.add(new HomeListModel("Aman"));
        models.add(new HomeListModel("Aman"));
        models.add(new HomeListModel("Aman"));
        models.add(new HomeListModel("Aman"));
        models.add(new HomeListModel("Aman"));

        getHomeList(binding.homeListRecycler1);
        getHomeList(binding.homeListRecycler2);


        binding.categoryLinear.setOnClickListener(view -> startActivity(new Intent(activity, ChooseCategoryActivity.class)));
        return binding.getRoot();
    }

    private void getHomeList(RecyclerView recyclerView) {
        LinearLayoutManager manager = new LinearLayoutManager(activity);
        manager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(new HomeListAdapter(activity, models));
    }
}