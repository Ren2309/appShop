package com.example.y;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class lnv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lnv);

        // Mendapatkan referensi ImageView
        ImageView imageView = findViewById(R.id.imageView2);

        // Mendapatkan referensi tombol Share
        Button btnShare = findViewById(R.id.btnShare);

        // Menambahkan OnClickListener untuk tombol Share
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareContent();
            }
        });
    }

    private void shareContent() {
        // Buat Intent dengan aksi ACTION_SEND
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("image/*"); // Tipe konten yang akan dibagikan

        // Tambahkan data yang akan dibagikan (gambar dalam contoh ini)
        shareIntent.putExtra(Intent.EXTRA_STREAM, getImageUri());

        // Memulai aktivitas untuk memilih aplikasi yang akan digunakan untuk berbagi
        startActivity(Intent.createChooser(shareIntent, "Bagikan gambar melalui"));
    }

    // Fungsi untuk mendapatkan URI gambar dari resource drawable
    private android.net.Uri getImageUri() {
        android.net.Uri imageUri = android.net.Uri.parse("android.resource://" + getPackageName() + "/" + R.drawable.lnv);
        return imageUri;
    }
}
