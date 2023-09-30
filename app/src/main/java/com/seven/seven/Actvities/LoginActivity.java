package com.seven.seven.Actvities;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.myloadingbutton.MyLoadingButton;
import com.royrodriguez.transitionbutton.TransitionButton;
import com.seven.seven.R;
import com.seven.seven.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity implements MyLoadingButton.MyLoadingButtonClick {

    ActivityLoginBinding binding;
    LoginActivity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        activity = this;

        binding.myLoadingButton.setAnimationDuration(300)
                .setButtonLabel("Login") // Set MyLoadingButton button label text.
                .setButtonLabelSize(17) // Set button label size in integer.
                .setProgressLoaderColor(Color.WHITE) // Set Color att for loader color.
                .setButtonLabelColor(R.color.white) // Set button label/text color.
                .setProgressDoneIcon(getResources().getDrawable(com.example.myloadingbutton.R.drawable.ic_progress_done)) // Set MyLoadingButton done icon drawable.
                .setProgressErrorIcon(getResources().getDrawable(com.example.myloadingbutton.R.drawable.ic_progress_cancle)) //Set MyLoadingButton error icon drawable.
                .setNormalAfterError(true);

        binding.myLoadingButton.setMyButtonClickListener(activity);

        binding.loginBtn.setOnClickListener(view -> {
            startActivity(new Intent(activity, HomeActivity.class));
            finish();
        });
        binding.gotoSignup.setOnClickListener(view -> startActivity(new Intent(activity, SignUpActivity.class)));

    }

    @Override
    public void onMyLoadingButtonClick() {
        startActivity(new Intent(activity, HomeActivity.class));
        ///binding.myLoadingButton.showDoneButton();
    }
}