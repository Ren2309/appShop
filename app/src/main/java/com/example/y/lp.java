package com.example.y;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.y.R;

public class lp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lp); // Ganti dengan layout yang sesuai

        // Mendapatkan referensi ImageView
        ImageView imageView1 = findViewById(R.id.btnrog);
        ImageView imageView2 = findViewById(R.id.btnac);
        ImageView imageView3 = findViewById(R.id.btnhp);
        ImageView imageView4 = findViewById(R.id.btndel);
        ImageView imageView5 = findViewById(R.id.btnlnv);

        // Menambahkan OnClickListener untuk setiap ImageView
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView1 diklik
                Intent intent = new Intent(lp.this, rog.class);
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView2 diklik
                Intent intent = new Intent(lp.this, ac.class);
                startActivity(intent);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView3 diklik
                Intent intent = new Intent(lp.this, hpl.class);
                startActivity(intent);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView4 diklik
                Intent intent = new Intent(lp.this, del.class);
                startActivity(intent);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView5 diklik
                Intent intent = new Intent(lp.this, lnv.class);
                startActivity(intent);
            }
        });
    }
}
