package com.example.tugasbtmnav.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.example.tugasbtmnav.R;
import com.example.tugasbtmnav.ruang.Balok;
import com.example.tugasbtmnav.ruang.Bola;
import com.example.tugasbtmnav.ruang.Krucut;
import com.example.tugasbtmnav.ruang.Kubus;
import com.example.tugasbtmnav.ruang.Tabung;


public class BangunRuang extends Fragment {

    ImageView kubus;
    ImageView balok;
    ImageView kerucut;
    ImageView tabung;
    ImageView bola;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bangun_ruang, container, false);

        kubus = view.findViewById(R.id.kubus);
        balok = view.findViewById(R.id.balok);
        kerucut = view.findViewById(R.id.krucut);
        tabung = view.findViewById(R.id.tabung);
        bola = view.findViewById(R.id.bola);



        kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Kubus.class);
                startActivity(intent);
            }
        });

        balok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Balok.class);
                startActivity(intent);
            }
        });

        kerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Krucut.class);
                startActivity(intent);
            }
        });

        tabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Tabung.class);
                startActivity(intent);
            }
        });

        bola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Bola.class);
                startActivity(intent);
            }
        });

        return view;
    }
}