package com.example.trabalhoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void vaisegundaTela(View v) {
        Intent intent = new Intent(this, SegundaTela.class);
        Bundle bundle = new Bundle();
        TextView textView = (TextView) findViewById(R.id.textName);
        bundle.putString("nameField", textView.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }

}



