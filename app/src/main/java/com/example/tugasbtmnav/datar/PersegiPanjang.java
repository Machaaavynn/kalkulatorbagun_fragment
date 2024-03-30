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

public class PersegiPanjang extends AppCompatActivity {

    private EditText inputPanjang, inputLebar;
    private TextView hasilnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        inputPanjang = findViewById(R.id.InputPanjang);
        inputLebar = findViewById(R.id.InputLebar);
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
        // Mendapatkan nilai panjang dan lebar dari inputan pengguna
        String panjangStr = inputPanjang.getText().toString().trim();
        String lebarStr = inputLebar.getText().toString().trim();

        if (panjangStr.isEmpty() || lebarStr.isEmpty()) {
            Toast.makeText(this, "Masukkan nilai panjang dan lebar terlebih dahulu", Toast.LENGTH_SHORT).show();
            return;
        }

        double panjang = Double.parseDouble(panjangStr);
        double lebar = Double.parseDouble(lebarStr);

        // Menghitung luas persegi panjang
        double luas = panjang * lebar;

        // Menampilkan hasil luas
        DecimalFormat df = new DecimalFormat("#.##");
        String luasStr = df.format(luas);
        hasilnya.setText(String.valueOf(luasStr));
    }
}
