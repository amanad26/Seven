package com.seven.seven.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seven.seven.Actvities.SettingsActivity;
import com.seven.seven.R;
import com.seven.seven.databinding.FragmentProfileBinding;


public class ProfileFragment extends Fragment {


    Activity activity;

    public ProfileFragment() {
        // Required empty public constructor
    }

    FragmentProfileBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(getLayoutInflater());
        activity = requireActivity();

        binding.setting.setOnClickListener(view -> startActivity(new Intent(activity, SettingsActivity.class)));

        return binding.getRoot();
    }
}