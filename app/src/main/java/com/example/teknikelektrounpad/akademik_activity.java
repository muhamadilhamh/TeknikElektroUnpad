package com.example.teknikelektrounpad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class akademik_activity extends AppCompatActivity {

    LinearLayout btn_back, cek_kurikulum, cek_jadwal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akademik_activity);
        cek_jadwal = findViewById(R.id.cek_jadwal);
        cek_jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotojadwal = new Intent(akademik_activity.this, jadwal_detailAct.class);
                startActivity(gotojadwal);
            }
        });
        cek_kurikulum = findViewById(R.id.cek_kurikulum);
        cek_kurikulum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotokurikulum = new Intent(akademik_activity.this, kurikulum_detailAct.class);
                startActivity(gotokurikulum);
            }
        });
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(akademik_activity.this, activity_home.class);
                startActivity(gotohome);
            }
        });

    }
}