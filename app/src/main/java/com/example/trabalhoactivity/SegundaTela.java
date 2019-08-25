package com.example.trabalhoactivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class SegundaTela<btnSim, btnNao> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("nameField");
        TextView nameField = (TextView) findViewById(R.id.nomeID);
        nameField.setText(name);
    }

        public void vaiTerceiraTela (View v){
        final Intent intent1 = new Intent(getBaseContext(), TerceiraTela.class);
        final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setTitle("!!!!!!Aviso!!!!!!");
        builder1.setMessage("Tem certeza de que quer ver a GRANDE?");


        DialogInterface.OnClickListener btnSim = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Olhe como se faz um pão", Toast.LENGTH_LONG).show();
                startActivity(intent1);
            }
        };


        DialogInterface.OnClickListener btnNao = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

            }
        };
        builder1.setPositiveButton("Sim", btnSim);
        builder1.setNegativeButton("Não", btnNao);
        builder1.create().show();
    }
}






// {
  //      ;
    //    //