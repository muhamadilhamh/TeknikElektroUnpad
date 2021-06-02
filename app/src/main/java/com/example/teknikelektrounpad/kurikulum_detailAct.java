package com.example.teknikelektrounpad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class kurikulum_detailAct extends AppCompatActivity {

    LinearLayout btn_back_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurikulum_detail);
        btn_back_home = findViewById(R.id.btn_back_home);
        btn_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(kurikulum_detailAct.this, activity_home.class);
                startActivity(gotohome);
            }
        });
    }
}