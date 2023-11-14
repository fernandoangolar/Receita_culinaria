package com.evandre.ao.receitaculinariaangolar.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.evandre.ao.receitaculinariaangolar.R;

public class TelaCadastro extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

//        buttonCadstrado = findViewById(R.id.buttonCadastrado);

//        buttonCadstrado.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                Context context = getApplicationContext();
//                toast.makeText(context, mensage, durantion);
//                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//                toast.show();
//            }
//        });
    }

    public void mensageToast ( View view ) {

//        Context context = getApplicationContext();
//        Toast toast = Toast.makeText(context, "Mensagem.....", Toast.LENGTH_LONG);
//
//// Retorna a View padrão da mensagem
//        View toastView = toast.getView();
//
//// Para customizar o texto da mensagem obter a View do componente do texto
//// que no caso é um TextView
//        TextView toastMessage = (TextView) toastView.findViewById(android.R.id.message);
//        toastMessage.setTextSize(50);
//        toastMessage.setTextColor(Color.WHITE);
//
//// Centraliza a mensagem no centro da tela
//        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//
//// Altera a cor de fundo da mensagem
//        toastView.setBackgroundColor(Color.BLACK);
//
//// Exibe a mensagem
//        toast.show();

//        TextView textView = new TextView( getApplicationContext() );
//        textView.setBackgroundColor(Color.BLACK);
//
//        textView.setText("Olá Toast");
//
//        Toast toast = new Toast( getApplicationContext() );
//        toast.setDuration( Toast.LENGTH_LONG );
//        toast.setView(textView);
//        toast.getView();
//        toast.show();



        Toast.makeText(this, "USUÁRIO CADASTRADO COM SUCESSO", Toast.LENGTH_LONG)
                .show();

    }
}