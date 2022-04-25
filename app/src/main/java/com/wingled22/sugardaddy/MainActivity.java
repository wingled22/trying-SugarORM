package com.wingled22.sugardaddy;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        btn = (Button) findViewById(R.id.btn);
    }




    public void BTNClick (View v){
        //btn.setText("I'm your new button");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }




}
