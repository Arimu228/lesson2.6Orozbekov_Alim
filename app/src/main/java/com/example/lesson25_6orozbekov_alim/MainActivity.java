package com.example.lesson25_6orozbekov_alim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText Email = findViewById(R.id.Email);
        EditText password = findViewById(R.id.password);
        Button btn = findViewById(R.id.btn_login);
        Button button = findViewById(R.id.btn_login);
         button.setOnClickListener(view -> {
            if (Email.getText().toString().equals("Clown") && password.getText().toString().equals("1234")) {
                Toast.makeText(this, "Вы успешно зарегистрировались", Toast.LENGTH_LONG).show();
            } else {            Toast.makeText(this, "пароль или логин не правильный", Toast.LENGTH_LONG).show();
                password.setVisibility(View.INVISIBLE);
                btn.setVisibility(View.VISIBLE);
                Email.setVisibility(View.INVISIBLE);

            }


        });

    }}
