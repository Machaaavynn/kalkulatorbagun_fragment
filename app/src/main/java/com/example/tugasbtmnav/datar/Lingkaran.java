package com.example.tugasbtmnav.datar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tugasbtmnav.R;

public class Lingkaran extends AppCompatActivity {

    private EditText inputJariJari;
    private TextView hasilLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        inputJariJari = findViewById(R.id.InputJarijari);
        hasilLuas = findViewById(R.id.hasilnya);

        ImageView btnHasil = findViewById(R.id.BTNHasil);
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
    }

    private void hitungLuas() {
        // Ambil nilai jari-jari dari EditText dan konversi ke tipe data double
        String jariJariStr = inputJariJari.getText().toString().trim();
        if (!jariJariStr.isEmpty()) {
            double jariJari = Double.parseDouble(jariJariStr);

            // Hitung luas lingkaran
            double luas = Math.PI * jariJari * jariJari;

            // Tampilkan hasil luas ke TextView
            hasilLuas.setText(String.valueOf(luas));
            hasilLuas.setVisibility(View.VISIBLE); // Menampilkan hasil
        } else {
            // Jika pengguna tidak memasukkan nilai jari-jari, tampilkan pesan kesalahan
            hasilLuas.setText("Masukkan nilai jari-jari terlebih dahulu.");
            hasilLuas.setVisibility(View.INVISIBLE); // Sembunyikan hasil
        }
    }
}