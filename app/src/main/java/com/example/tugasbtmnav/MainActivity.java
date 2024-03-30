package com.example.tugasbtmnav;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tugasbtmnav.fragment.BangunDatar;
import com.example.tugasbtmnav.fragment.BangunRuang;
import com.example.tugasbtmnav.fragment.Profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.BottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_layout, new BangunDatar())
                .commit();
    }

    private BottomNavigationView.OnItemSelectedListener navListener =
            new BottomNavigationView.OnItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    if (item.getItemId() == R.id.Datar) {
                        selectedFragment = new BangunDatar();
                    } else if (item.getItemId() == R.id.Ruang) {
                        selectedFragment = new BangunRuang();
                    } else if (item.getItemId() == R.id.Profile) {
                        selectedFragment = new Profile();
                    }

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frame_layout, selectedFragment)
                            .commit();

                    return true;
                }
            };
}