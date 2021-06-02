package com.example.teknikelektrounpad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class labKomputer_Act extends AppCompatActivity {

    LinearLayout btn_back_home, btn_back_fasilitas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_komputer_);
        btn_back_fasilitas = findViewById(R.id.btn_back_fasilitas);
        btn_back_fasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtofasilitas = new Intent(labKomputer_Act.this, fasilitas_activity.class);
                startActivity(backtofasilitas);
            }
        });
        btn_back_home = findViewById(R.id.btn_back_home);
        btn_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtohome = new Intent(labKomputer_Act.this, activity_home.class);
                startActivity(backtohome);
            }
        });
    }
}