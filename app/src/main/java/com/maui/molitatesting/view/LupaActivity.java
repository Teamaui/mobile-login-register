package com.maui.molitatesting.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.maui.molitatesting.R;

public class LupaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lupa);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Aksi klik lupa sandi untuk mengakses halaman LupaActivity
        Button btnSelanjutnya1 = findViewById(R.id.btnSelanjutnya1);
        btnSelanjutnya1.setOnClickListener(v -> {
            Intent intent = new Intent(LupaActivity.this, UbahSandiActivity.class);
            startActivity(intent);
        });

        ImageView imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(v -> {
            Intent intent = new Intent(LupaActivity.this, LoginActivity.class);
            startActivity(intent);
        });

    }
}