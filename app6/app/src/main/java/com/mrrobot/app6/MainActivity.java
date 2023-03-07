package com.mrrobot.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        // Uygulamada bir sayaç kullanmak istiyorsak...
        new CountDownTimer(10000, 1000) {
            //1.parametre kaç saniye süreceğini, 2.parametre kaç saniyede bir işlem yapacağını belirtir.
            @Override
            public void onTick(long l) {//Her saniye neler yapılacağını belirtmek için
                    textView.setText("Left: "+l/1000);
            }

            @Override
            public void onFinish() {//Bitince neler yapılacağını belirtmek için
                textView.setText("Sayaç bitmiştir");
            }
        }.start();//Başlatır
    }
}