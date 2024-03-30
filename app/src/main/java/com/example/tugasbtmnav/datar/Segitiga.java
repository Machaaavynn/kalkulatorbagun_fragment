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

public class Segitiga extends AppCompatActivity {

    private EditText inputAlas, inputTinggi;
    private TextView hasilnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        inputAlas = findViewById(R.id.InputAlas);
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
        // Mendapatkan nilai alas dan tinggi dari inputan pengguna
        String alasStr = inputAlas.getText().toString().trim();
        String tinggiStr = inputTinggi.getText().toString().trim();

        if (alasStr.isEmpty() || tinggiStr.isEmpty()) {
            Toast.makeText(this, "Masukkan nilai alas dan tinggi terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double alas = Double.parseDouble(alasStr);
        double tinggi = Double.parseDouble(tinggiStr);

        // Menghitung luas segitiga
        double luas = 0.5 * alas * tinggi;

        // Menampilkan hasil luas
        DecimalFormat df = new DecimalFormat("#.##");
        String luasStr = df.format(luas);
        hasilnya.setText(String.valueOf(luasStr));
    }
}
