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

public class Bola extends AppCompatActivity {

    private EditText inputJariJari;
    private TextView hasilnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        inputJariJari = findViewById(R.id.InputJarijari);
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
        // Mendapatkan nilai jari-jari dari inputan pengguna
        String jariJariStr = inputJariJari.getText().toString().trim();

        if (jariJariStr.isEmpty()) {
            Toast.makeText(this, "Masukkan nilai jari-jari terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double jariJari = Double.parseDouble(jariJariStr);

        // Menghitung volume bola
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);

        // Menampilkan hasil volume
        DecimalFormat df = new DecimalFormat("#.##");
        String volumeStr = df.format(volume);
        hasilnya.setText(String.valueOf(volumeStr));
    }
}
