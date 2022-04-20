package ru.maxfad.myraspisanie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button11,button10, button9,button8,button7,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button11 =(Button)findViewById(R.id.button11);
        button10 =(Button)findViewById(R.id.button10);
        button9 =(Button)findViewById(R.id.button9);
        button8 =(Button)findViewById(R.id.button8);
        button7 =(Button)findViewById(R.id.button7);
        button6 =(Button)findViewById(R.id.button6);



        button11.setOnClickListener(new OnClickListener() {
          @Override
           public void onClick(View v) {

              Intent intent = new Intent();
              intent.setClass(MainActivity.this, Main11Activity.class);
              Bundle b = new Bundle();
              b.putString("classID", "Ю");
              intent.putExtras(b);
              startActivity(intent);
          }
        });

        button10.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main11Activity.class);
                Bundle b = new Bundle();
                b.putString("classID", "СА");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main11Activity.class);
                Bundle b = new Bundle();
                b.putString("classID", "БИ");
                intent.putExtras(b);
                startActivity(intent);
            }
        });


        button8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main11Activity.class);
                Bundle b = new Bundle();
                b.putString("classID", "П");
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        button7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main11Activity.class);
                Bundle b = new Bundle();
                b.putString("classID", "ИС");
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main11Activity.class);
                Bundle b = new Bundle();
                b.putString("classID", "ПП");
                intent.putExtras(b);
                startActivity(intent);
            }
        });



    }



}
