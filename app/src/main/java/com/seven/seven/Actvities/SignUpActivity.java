package com.seven.seven.Actvities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.seven.seven.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;
    SignUpActivity activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        activity = this;

        binding.signupBtn.setOnClickListener(view -> startActivity(new Intent(activity, HomeActivity.class)));

        binding.gotologin.setOnClickListener(view -> startActivity(new Intent(activity, LoginActivity.class)));


    }
}