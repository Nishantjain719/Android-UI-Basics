package com.example.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dashboard.Common.LoginSignup.StartUpScreen;
import com.example.dashboard.HomeAdapter.FeaturedAdapter;
import com.example.dashboard.HomeAdapter.FeaturedHelperClass;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView featuredRecycler, recyclerView, catRecycler;
    RecyclerView.Adapter adapter;
    ImageView loginSignUpBtn, menuIcon;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    String s1[], s2[];
    int images[] = {R.drawable.p1, R.drawable.p4, R.drawable.p5, R.drawable.p6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        // Hooks
        featuredRecycler = findViewById(R.id.featured_recycler);
        recyclerView = findViewById(R.id.most_view);
        catRecycler = findViewById(R.id.cat_rec);
        loginSignUpBtn = findViewById(R.id.login_signup);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.my_tool);

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        s1 = getResources().getStringArray(R.array.products);
        s2 = getResources().getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyNeAdapter myNeAdapter = new MyNeAdapter(this, s1, images);
        catRecycler.setAdapter(myNeAdapter);
        catRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        featuredRecycler();

    }

    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.mcdonals, "Mcdonald's", "nbh dfhu ndfhkuwhr efyrjfnfhu hsgdteeufh"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.p1, "Nike shirt", "nbh dfhu ndfhkuwhr efyrjfnfhu hsgdteeufh"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.mcdonals, "Mcdonald's", "nbh dfhu ndfhkuwhr efyrjfnfhu hsgdteeufh"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.p4, "gucci pant", "nbh dfhu ndfhkuwhr efyrjfnfhu hsgdteeufh"));

        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecycler.setAdapter(adapter);


    }

    public void callStartUpScreen(View view) {

        startActivity(new Intent(getApplicationContext(), StartUpScreen.class));

    }


}