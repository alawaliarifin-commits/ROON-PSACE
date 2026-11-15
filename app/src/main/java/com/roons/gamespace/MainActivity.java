package com.roons.gamespace;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Tampilan awal Game Space
        TextView tv = new TextView(this);
        tv.setText("ROON SPACE - Game Booster Active\nFPS: 60 | Temp: 36°C | Battery: 85%");
        tv.setTextSize(18f);
        tv.setPadding(50, 50, 50, 50);
        
        setContentView(tv);
    }
                       }
