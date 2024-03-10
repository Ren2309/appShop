package com.example.y;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.y.R;

public class hp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hp);

        // Mendapatkan referensi ImageView
        ImageView imageView1 = findViewById(R.id.btnf61);
        ImageView imageView2 = findViewById(R.id.btnf71);
        ImageView imageView3 = findViewById(R.id.btns221);
        ImageView imageView4 = findViewById(R.id.btns241); // Pastikan ID ini sesuai dengan layout
        ImageView imageView5 = findViewById(R.id.btns); // Pastikan ID ini sesuai dengan layout

        // Menambahkan OnClickListener untuk setiap ImageView
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView1 diklik
                Intent intent = new Intent(hp.this, op.class);
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView2 diklik
                Intent intent = new Intent(hp.this, f7.class);
                startActivity(intent);
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView3 diklik
                Intent intent = new Intent(hp.this, s22.class);
                startActivity(intent);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView4 diklik
                Intent intent = new Intent(hp.this, s24.class);
                startActivity(intent);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman lain ketika imageView5 diklik
                Intent intent = new Intent(hp.this, s23.class);
                startActivity(intent);
            }
        });
    }
}
