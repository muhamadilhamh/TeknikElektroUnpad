package com.example.teknikelektrounpad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class jadwal_detailAct extends AppCompatActivity {

    LinearLayout btn_ganjil, btn_genap, btn_back_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_detail);
        btn_back_home = findViewById(R.id.btn_back_home);
        btn_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backtohome = new Intent(jadwal_detailAct.this, activity_home.class);
                startActivity(backtohome);
            }
        });
        btn_genap = findViewById(R.id.btn_genap);
        btn_genap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/19YCT_tMkA_7cDkxaJ63-sfN3_rUvBdS-/view");
            }
        });
        btn_ganjil = findViewById(R.id.btn_ganjil);
        btn_ganjil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1idvfyKQ_VTCQVXjOBIGjXgdvgcRSVAYc/view");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}