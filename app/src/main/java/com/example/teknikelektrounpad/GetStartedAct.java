package com.example.teknikelektrounpad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStartedAct extends AppCompatActivity {

    Button btn_ekspor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        btn_ekspor = findViewById(R.id.btn_ekspor);
        btn_ekspor.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent gotodashboard = new Intent(GetStartedAct.this, activity_home.class);
            startActivity(gotodashboard);
        }
    });
    }
}