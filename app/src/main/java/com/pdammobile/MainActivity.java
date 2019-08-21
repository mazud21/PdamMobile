package com.pdammobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

import com.pdammobile.Model.InfoMasalah;
import com.pdammobile.ui.InfoMasalahUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llDetail = (LinearLayout) findViewById(R.id.lldetail);
        LinearLayout llPengaduan = (LinearLayout) findViewById(R.id.llpengaduan);
        LinearLayout llInfo = (LinearLayout) findViewById(R.id.llinfo);

        llDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_detail = new Intent(MainActivity.this,DetailTagihan.class);
                startActivity(intent_detail);
            }
        });

        llPengaduan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_pengaduan = new Intent(MainActivity.this,Pengaduan.class);
                startActivity(intent_pengaduan);
            }
        });

        llInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_info = new Intent(MainActivity.this, InfoMasalahUI.class);
                startActivity(intent_info);
            }
        });
    }
}
