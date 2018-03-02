package com.sebastian.componentesui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {



    private final String TAG = ButtonActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);


    }



    //public con parametro view
    public void Callbutton1(View view){
        Log.wtf(TAG,"Entró y no salió");

        Toast.makeText(this, "Pulsó el boton", Toast.LENGTH_LONG).show();
    }

    public void Callbutton2(View view){
        Log.wtf(TAG,"Otro botón");

        Toast.makeText(this, "Pulsó el boton", Toast.LENGTH_SHORT).show();
    }

}
