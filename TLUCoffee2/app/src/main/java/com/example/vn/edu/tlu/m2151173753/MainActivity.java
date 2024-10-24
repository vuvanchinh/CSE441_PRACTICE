package com.example.vn.edu.tlu.m2151173753;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CoffeeFragment()).commit();
            navigationView.setCheckedItem(R.id.cafe);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.cafe) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CoffeeFragment()).commit();
        } else if (id == R.id.fruit_juice) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FruitJuiceFragment()).commit();
        } else if (id == R.id.special_tea) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SpecialTeaFragment()).commit();
        } else if (id == R.id.cake) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CakeFragment()).commit();
        } else if (id == R.id.salty_cake) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SaltyCakeFragment()).commit();
        } else if (id == R.id.setting) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SettingFragment()).commit();
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}
