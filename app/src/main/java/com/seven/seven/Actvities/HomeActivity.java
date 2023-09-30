package com.seven.seven.Actvities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.gauravk.bubblenavigation.listener.BubbleNavigationChangeListener;
import com.seven.seven.Fragments.ExploreFragment;
import com.seven.seven.Fragments.HomeFragment;
import com.seven.seven.Fragments.PrimeFragment;
import com.seven.seven.Fragments.ProfileFragment;
import com.seven.seven.R;
import com.seven.seven.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    private HomeActivity activity;
    private ActivityHomeBinding binding;
    boolean isLoad = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        activity = this;


//        Window window = activity.getWindow();
//        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//        window.setStatusBarColor(ContextCompat.getColor(activity, R.color.white));


        loadFrag(isLoad, new HomeFragment());

        /*   binding.bubbleTabBar.addBubbleListener(id -> {
            switch (id) {
                case R.id.nav_home:
                    loadFrag(true, new HomeFragment());
                    break;
                case R.id.nav_explore:
                    loadFrag(true, new ExploreFragment());
                    break;

                case R.id.nav_profile:
                    loadFrag(true, new ProfileFragment());
                    break;

                case R.id.nav_prime:
                    loadFrag(true, new PrimeFragment());
                    break;

                default:
                    loadFrag(true, new HomeFragment());
            }
        });*/


        binding.bottomNavigationViewLinear.setNavigationChangeListener(new BubbleNavigationChangeListener() {
            @Override
            public void onNavigationChanged(View view, int position) {
                switch (position) {
                    case 0:
                        loadFrag(true, new HomeFragment());
                        binding.linearLayout.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        loadFrag(true, new ExploreFragment());
                        binding.linearLayout.setVisibility(View.VISIBLE);
                        break;

                    case 2:
                        loadFrag(true, new ProfileFragment());
                        binding.linearLayout.setVisibility(View.GONE);
                        break;

                    case 3:
                        loadFrag(true, new PrimeFragment());
                        binding.linearLayout.setVisibility(View.VISIBLE);
                        break;

                    default:
                        loadFrag(true, new HomeFragment());
                }
            }
        });


    }

    private void loadFrag(boolean isLoaded, Fragment fragment) {

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        if (isLoaded) transaction.replace(R.id.container, fragment).commit();
        else transaction.add(R.id.container, fragment).commit();

        isLoad = true;

    }
}