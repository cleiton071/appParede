package com.cleiton071.pinturaparede;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class infoParede extends AppCompatActivity implements View.OnClickListener {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_parede);

        this.mViewHolder.voltar = findViewById(R.id.button_voltar);
        this.mViewHolder.altParede = findViewById(R.id.editText_altParede);
        this.mViewHolder.baseParede = findViewById(R.id.editText_baseParede);
        this.mViewHolder.qtdPorta = findViewById(R.id.editText_qtdPorta);
        this.mViewHolder.qtdJanela = findViewById(R.id.editText_qtdJanela);
        this.mViewHolder.saveDado = findViewById(R.id.button_saveDado);
        this.mViewHolder.saida = findViewById(R.id.textView_saida);
        this.mViewHolder.saveDado.setOnClickListener(this);
        this.mViewHolder.voltar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_voltar) {

            Intent volt = new Intent(this, MainActivity.class);
            startActivity(volt);
        }
        if (v.getId() == R.id.button_saveDado) {

            String altura = this.mViewHolder.altParede.getText().toString();
            String largura = this.mViewHolder.baseParede.getText().toString();


            if ("".equals(altura) || "".equals(largura)) {

                Toast.makeText(this, "preencha todos os campos!", Toast.LENGTH_LONG).show();

            }
            Double paredeAlt = Double.valueOf(altura);
            Double paredeLar = Double.valueOf(largura);

            this.mViewHolder.saida.setText(String.format("%.2f", paredeAlt));

        }
    }

    private static class ViewHolder {

        Button voltar;
        EditText altParede;
        EditText baseParede;
        EditText qtdPorta;
        EditText qtdJanela;
        Button saveDado;
        TextView saida;

    }
}