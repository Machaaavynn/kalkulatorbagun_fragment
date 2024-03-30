package com.example.tugasbtmnav.ruang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tugasbtmnav.R;

public class Balok extends AppCompatActivity {

    private EditText inputPanjang, inputLebar, inputTinggi;
    private TextView hasilVolumeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        inputPanjang = findViewById(R.id.InputPanjang);
        inputLebar = findViewById(R.id.InputLebar);
        inputTinggi = findViewById(R.id.InputTinggi);
        ImageView btnHasil = findViewById(R.id.BTNHasil);
        hasilVolumeTextView = findViewById(R.id.hasilnya);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolume();
            }
        });
    }

    private void hitungVolume() {
        // Mendapatkan nilai panjang, lebar, dan tinggi dari inputan pengguna
        double panjang = Double.parseDouble(inputPanjang.getText().toString());
        double lebar = Double.parseDouble(inputLebar.getText().toString());
        double tinggi = Double.parseDouble(inputTinggi.getText().toString());

        // Menghitung volume balok
        double volume = panjang * lebar * tinggi;

        // Menampilkan hasil volume pada TextView hasilVolumeTextView
        hasilVolumeTextView.setText(String.valueOf(volume));
        hasilVolumeTextView.setVisibility(View.VISIBLE); // Menampilkan TextView hasilVolumeTextView
    }
}
