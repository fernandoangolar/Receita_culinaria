package com.evandre.ao.receitaculinariaangolar.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.evandre.ao.receitaculinariaangolar.R;

public class TelaLogin extends AppCompatActivity {

    private Button buttonCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);

        buttonCadastro = findViewById(R.id.buttonCadastro);

        buttonCadastro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), TelaCadastro.class );

                startActivity( intent );
            }

        });
    }
}