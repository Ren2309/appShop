package com.example.y;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.y.R;

public class tws extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tws); // Ganti dengan layout yang sesuai

        // Mendapatkan referensi ImageView
        ImageView imageView1 = findViewById(R.id.btnrob);
        ImageView imageView2 = findViewById(R.id.btngro);
        ImageView imageView3 = findViewById(R.id.btnbas);
        ImageView imageView4 = findViewById(R.id.btnsx60);
        ImageView imageView5 = findViewById(R.id.btn08);

        // Menambahkan OnClickListener untuk setiap ImageView
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView1 diklik
                Intent intent = new Intent(tws.this, rob.class);
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView2 diklik
                Intent intent = new Intent(tws.this, gr.class);
                startActivity(intent);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView3 diklik
                Intent intent = new Intent(tws.this, bs.class);
                startActivity(intent);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView4 diklik
                Intent intent = new Intent(tws.this, x60.class);
                startActivity(intent);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView5 diklik
                Intent intent = new Intent(tws.this, x08.class);
                startActivity(intent);
            }
        });
    }
}
