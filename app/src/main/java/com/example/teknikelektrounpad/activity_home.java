package com.example.teknikelektrounpad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class activity_home extends AppCompatActivity {

    LinearLayout btn_akademik, btn_alumni, btn_fasilitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn_fasilitas = findViewById(R.id.btn_fasilitas);
        btn_fasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotofasilitas = new Intent(activity_home.this, fasilitas_activity.class);
                startActivity(gotofasilitas);
            }
        });
        btn_alumni = findViewById(R.id.btn_alumni);
        btn_alumni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoalumni = new Intent(activity_home.this, alumni_detailAct.class);
                startActivity(gotoalumni);
            }
        });
        btn_akademik = findViewById(R.id.btn_akademik);
        btn_akademik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoakademik = new Intent(activity_home.this, akademik_activity.class);
                startActivity(gotoakademik);
            }
        });
    }
}