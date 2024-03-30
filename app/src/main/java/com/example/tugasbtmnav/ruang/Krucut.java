package com.example.tugasbtmnav.ruang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
import com.example.tugasbtmnav.R;

public class Krucut extends AppCompatActivity {

    private EditText inputJariJari, inputTinggi;
    private TextView hasilnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krucut);

        inputJariJari = findViewById(R.id.InputJarijari);
        inputTinggi = findViewById(R.id.InputTinggi);
        hasilnya = findViewById(R.id.hasilnya);
        ImageView btnHasil = findViewById(R.id.BTNHasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolume();
            }
        });
    }

    private void hitungVolume() {
        // Mendapatkan nilai jari-jari dan tinggi dari inputan pengguna
        String jariJariStr = inputJariJari.getText().toString().trim();
        String tinggiStr = inputTinggi.getText().toString().trim();

        if (jariJariStr.isEmpty() || tinggiStr.isEmpty()) {
            Toast.makeText(this, "Masukkan nilai jari-jari dan tinggi terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double jariJari = Double.parseDouble(jariJariStr);
        double tinggi = Double.parseDouble(tinggiStr);

        // Menghitung volume kerucut
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;

        // Menampilkan hasil volume
        DecimalFormat df = new DecimalFormat("#.##");
        String volumeStr = df.format(volume);
        hasilnya.setText(String.valueOf(volumeStr));
    }
}
