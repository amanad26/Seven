package com.seven.seven.Actvities;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.seven.seven.MainActivity;
import com.seven.seven.R;
import com.seven.seven.Session.Session;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    private SplashActivity activity;
    private Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        activity = this;
        session = new Session(activity);

        Window window = activity.getWindow();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//      window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//      window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//      window.setStatusBarColor(ContextCompat.getColor(activity, R.color.textColor));

        new Thread(() -> {
            try {
                sleep(2000);
                if (session.getUserId().equalsIgnoreCase("")) {
                    startActivity(new Intent(activity, LoginActivity.class));
                    finish();
                } else {
                    startActivity(new Intent(activity, HomeActivity.class));
                    finish();
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}