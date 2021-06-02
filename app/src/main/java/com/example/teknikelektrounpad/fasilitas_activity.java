package com.example.teknikelektrounpad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class fasilitas_activity extends AppCompatActivity {

    LinearLayout lab_komputer, btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas_activity);
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(fasilitas_activity.this, activity_home.class);
                startActivity(gotohome);
            }
        });
        lab_komputer = findViewById(R.id.lab_komputer);
        lab_komputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotolabkom = new Intent(fasilitas_activity.this, labKomputer_Act.class);
                startActivity(gotolabkom);
            }
        });
    }
}