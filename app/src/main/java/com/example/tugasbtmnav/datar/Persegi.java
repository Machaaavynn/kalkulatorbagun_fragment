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

public class Persegi extends AppCompatActivity {

    private EditText inputSisi;
    private TextView hasilnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        inputSisi = findViewById(R.id.InputSisi);
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
        // Mendapatkan nilai panjang sisi dari inputan pengguna
        String sisiStr = inputSisi.getText().toString().trim();

        if (sisiStr.isEmpty()) {
            Toast.makeText(this, "Masukkan nilai panjang sisi terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double sisi = Double.parseDouble(sisiStr);

        // Menghitung luas persegi
        double luas = sisi * sisi;

        // Menampilkan hasil luas
        DecimalFormat df = new DecimalFormat("#.##");
        String luasStr = df.format(luas);
        hasilnya.setText(String.valueOf(luasStr));
    }
}
