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

public class Kubus extends AppCompatActivity {

    private EditText inputSisi;
    private TextView hasilnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        inputSisi = findViewById(R.id.InputSisi);
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
        // Mendapatkan nilai sisi dari inputan pengguna
        String sisiStr = inputSisi.getText().toString().trim();

        if (sisiStr.isEmpty()) {
            Toast.makeText(this, "Masukkan nilai sisi terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double sisi = Double.parseDouble(sisiStr);

        // Menghitung volume kubus
        double volume = Math.pow(sisi, 3);

        // Menampilkan hasil volume
        DecimalFormat df = new DecimalFormat("#.##");
        String volumeStr = df.format(volume);
        hasilnya.setText(String.valueOf(volumeStr));
    }
}
