package com.example.mymooc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

TextView mtextview ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI ();
    }
    private void setupUI (){
      setContentView(R.layout.activity_main);
        mtextview = (TextView) findViewById(R.id.textView);
        //TODO  ggggg
    }
    private final static String LOG_TAG =MainActivity.class.getSimpleName();
    public void buttonpreesed (View view){
        Log.i(LOG_TAG,"buttonpreesed(View) IS Call");
String straingValue = "MSreda";
mtextview.setText(straingValue);
Log.v(LOG_TAG,"text change to"+straingValue);
Log.d(LOG_TAG,"buttonpreesed(View) finished");


    }

}