package com.example.opet.meuprimeiroappopet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText editText;
    private CheckBox checkOption;
    private Spinner spinnerFrutas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        checkOption = findViewById(R.id.checkOption);
        spinnerFrutas = findViewById(R.id.spinnerFrutas);
    }

    public void clique(View view){
        String texto = editText.getText().toString();
        String texto_spinner = spinnerFrutas.getSelectedItem().toString();
        if(view.getId() == R.id.btnClique){
            String marcada = "";
            if(checkOption.isChecked())
                marcada = "Sim";
            else
                marcada = "Não";
            Toast.makeText(this, texto_spinner, Toast.LENGTH_LONG).show();
        }else if(view.getId() == R.id.btnClique2){
            int numero = Integer.parseInt(texto);
            int result = numero * numero;
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();
            editText.setText(String.valueOf(result));
        }
    }
}
