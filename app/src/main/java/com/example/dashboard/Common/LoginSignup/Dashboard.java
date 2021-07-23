package com.example.dashboard.Common.LoginSignup;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.example.dashboard.LocationOwner.DashboardFragment;
import com.example.dashboard.LocationOwner.ManageFragment;
import com.example.dashboard.LocationOwner.ProfileFragment;
import com.example.dashboard.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.bottom_nav_dashboard:
                        selectedFragment = new DashboardFragment();
                        break;
                    case R.id.bottom_nav_manage:
                        selectedFragment = new ManageFragment();
                        break;
                    case R.id.bottom_nav_profile:
                        selectedFragment = new ProfileFragment();
                        break;
                }

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_layout, selectedFragment)
                        .commit();
              return true;

            }
        });

        bottomNav.setSelectedItemId(R.id.bottom_nav_dashboard);
    }



}