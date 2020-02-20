package com.example.qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button gomb1,gomb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        gomb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMasodik=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intentMasodik);
                finish();
            }
        });
        gomb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHarmadik=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intentHarmadik);
                finish();
            }
        });
    }
    public void init()
    {
        gomb1=findViewById(R.id.gomb1);
        gomb2=findViewById(R.id.gomb2);



    }
}
