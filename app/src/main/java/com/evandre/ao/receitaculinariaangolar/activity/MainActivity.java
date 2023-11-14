package com.evandre.ao.receitaculinariaangolar.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evandre.ao.receitaculinariaangolar.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonEntar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEntar = findViewById(R.id.buttonEntrar);

        buttonEntar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), TelaLogin.class);

                startActivity( intent );
            }
        });
    }
}