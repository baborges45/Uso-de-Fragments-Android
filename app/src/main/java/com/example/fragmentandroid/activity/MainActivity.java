package com.example.fragmentandroid.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentandroid.R;
import com.example.fragmentandroid.fragment.ContatosFragment;
import com.example.fragmentandroid.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonContato, buttonConversa;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //remover a sombra do ActionBar
        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();
        //Configurar o objeto para o fragment
        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, conversasFragment);
        transaction.commit();

        buttonContato =  findViewById(R.id.buttonContato);
        buttonConversa = findViewById(R.id.buttonConversa);

        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatosFragment);
                transaction.commit();
            }
        });
    }
}