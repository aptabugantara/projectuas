package com.example.mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import static com.example.mobil.MainActivity.EXTRA_GAMBAR;
import static com.example.mobil.MainActivity.EXTRA_HARGA;
import static com.example.mobil.MainActivity.EXTRA_KETERANGAN;
import static com.example.mobil.MainActivity.EXTRA_NAMA;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String gambar = intent.getStringExtra(EXTRA_GAMBAR);
        String harga = intent.getStringExtra(EXTRA_HARGA);
        String nama = intent.getStringExtra(EXTRA_NAMA);
        String keterangan = intent.getStringExtra(EXTRA_KETERANGAN);

        ImageView imageView = findViewById(R.id.gambar_detail);
        TextView tvhargadetail = findViewById(R.id.harga_detail);
        TextView tvnamadetail = findViewById(R.id.nama_detail);
        TextView tvketerangan = findViewById(R.id.keterangan_detail);

        Glide
                .with(this)
                .load(gambar)
                .centerCrop()
                .into(imageView);

        tvhargadetail.setText(harga);
        tvnamadetail.setText(nama);
        tvketerangan.setText(keterangan);


    }
}
