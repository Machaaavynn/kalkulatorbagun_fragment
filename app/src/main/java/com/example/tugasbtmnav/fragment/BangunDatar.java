package com.example.tugasbtmnav.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.tugasbtmnav.R;
import com.example.tugasbtmnav.datar.Lingkaran;
import com.example.tugasbtmnav.datar.Persegi;
import com.example.tugasbtmnav.datar.PersegiPanjang;
import com.example.tugasbtmnav.datar.Segitiga;
import com.example.tugasbtmnav.datar.Trapesium;


public class BangunDatar extends Fragment {

    ImageView jajargenjang;
    ImageView lingkaran;
    ImageView persegi;
    ImageView persegi_panjang;
    ImageView segitiga;
    ImageView trapesium;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bangun_datar, container, false);

        lingkaran = view.findViewById(R.id.lingkaran);
        persegi = view.findViewById(R.id.persegi);
        persegi_panjang = view.findViewById(R.id.persegipanjang);
        segitiga = view.findViewById(R.id.segitiga);
        trapesium = view.findViewById(R.id.trapesium);



        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Lingkaran.class);
                startActivity(intent);
            }
        });

        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Persegi.class);
                startActivity(intent);
            }
        });

        persegi_panjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PersegiPanjang.class);
                startActivity(intent);
            }
        });

        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Segitiga.class);
                startActivity(intent);
            }
        });

        trapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Trapesium.class);
                startActivity(intent);
            }
        });

        return view;
    }
}