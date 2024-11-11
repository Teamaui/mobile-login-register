package com.maui.molitatesting.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.maui.molitatesting.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        // Menangani insets untuk padding.
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Aksi klik tombol masuk
        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v -> {
            Toast.makeText(this, "Anda berhasil masuk!", Toast.LENGTH_SHORT).show();
        });

        // Aksi klik daftar untuk mengakses halaman RegisterActivity
        TextView txtDaftar = findViewById(R.id.txtDaftar);
        txtDaftar.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
        TextView txtBelum = findViewById(R.id.txtBelum);
        txtBelum.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });

        // Aksi klik lupa sandi untuk mengakses halaman LupaActivity
        TextView txtLupa = findViewById(R.id.txtLupa);
        txtLupa.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, LupaActivity.class);
            startActivity(intent);
        });
    }
}
