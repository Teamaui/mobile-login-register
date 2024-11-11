package com.maui.molitatesting.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.maui.molitatesting.R;

public class UbahSandiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ubah_sandi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView txtMasuk = findViewById(R.id.txtMasuk);
        txtMasuk.setOnClickListener(v -> {
            Intent intent = new Intent(UbahSandiActivity.this, LoginActivity.class);
            startActivity(intent);
        });
        TextView txtIngat = findViewById(R.id.txtIngat);
        txtIngat.setOnClickListener(v -> {
            Intent intent = new Intent(UbahSandiActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}