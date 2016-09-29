package com.example.juan.p03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
         //Se llama cuando el usuario hace clic en el botón Enviar
         public void sendMessage ( View view ) {
             Intent intent = new Intent( this , DisplayMessageActivity . class );
             EditText editText = (EditText) findViewById ( R . id . edit_message );
             String message = editText . getText (). toString ();
             intent . putExtra ( "MENSAJE" , message );
             startActivity ( intent );
         }


}
