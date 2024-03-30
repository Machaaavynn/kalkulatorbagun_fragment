package com.example.tugasbtmnav.datar;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
import com.example.tugasbtmnav.R;

public class Trapesium extends AppCompatActivity {

    private EditText inputSisiBawah, inputSisiAtas, inputTinggi;
    private TextView hasilnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);

        inputSisiBawah = findViewById(R.id.InputSisibawah);
        inputSisiAtas = findViewById(R.id.InputSisiatas);
        inputTinggi = findViewById(R.id.InputTinggi);
        hasilnya = findViewById(R.id.hasilnya);
        ImageView btnHasil = findViewById(R.id.BTNHasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
    }

    private void hitungLuas() {
        // Mendapatkan nilai sisi bawah, sisi atas, dan tinggi dari inputan pengguna
        String sisiBawahStr = inputSisiBawah.getText().toString().trim();
        String sisiAtasStr = inputSisiAtas.getText().toString().trim();
        String tinggiStr = inputTinggi.getText().toString().trim();

        if (sisiBawahStr.isEmpty() || sisiAtasStr.isEmpty() || tinggiStr.isEmpty()) {
            Toast.makeText(this, "Masukkan nilai sisi bawah, sisi atas, dan tinggi terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double sisiBawah = Double.parseDouble(sisiBawahStr);
        double sisiAtas = Double.parseDouble(sisiAtasStr);
        double tinggi = Double.parseDouble(tinggiStr);

        // Menghitung luas trapesium
        double luas = 0.5 * (sisiBawah + sisiAtas) * tinggi;

        // Menampilkan hasil luas
        DecimalFormat df = new DecimalFormat("#.##");
        String luasStr = df.format(luas);
        hasilnya.setText(String.valueOf(luasStr));
    }
}
