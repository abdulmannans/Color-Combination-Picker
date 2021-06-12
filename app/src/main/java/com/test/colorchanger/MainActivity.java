package com.test.colorchanger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.fonts.FontFamily;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnColor ;
    TextView txt;
    TextView txtColor;
    TextView bckGroundColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnColor = findViewById(R.id.clrChngr);
        txt = findViewById(R.id.textView);
        txtColor = findViewById(R.id.txtColor);
        bckGroundColor = findViewById(R.id.bckgrndColor);

        btnColor.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {


                int     r = randomNumber(),
                        b = randomNumber(),
                        g = randomNumber(),
                        r2 = randomNumber(),
                        b2 = randomNumber(),
                        g2 = randomNumber(),
                        r3 = randomNumber(),
                        b3 = randomNumber(),
                        g3 = randomNumber();

                int color = Color.rgb(r, g, b);
                int color2 = Color.rgb(r2, g2, b2);

                String colorHex = String.format("#%02x%02x%02x", r, g ,b),
                        colorHex2 = String.format("#%02x%02x%02x", r2, g2, b2);

                txt.setTextColor(ColorStateList.valueOf(color));
                txt.setBackgroundColor(color2);
                txt.setText(randomText());
                txtColor.setText(colorHex);
                bckGroundColor.setText(colorHex2);

            }
        });
    }
    public int randomNumber(){
        Random random = new Random();
        return random.nextInt(256);
    }
    public String randomText(){
        String[] words = {
                "Hello There",
                "Good Morning",
                "Keep Smiling",
                "Just Do It",
                "Save Yourself",
                "Be Free",
                "Hello World",
                "Believe",
                "Good Day",
                "Why??",
                "When?",
                "Who?",
                "Save Time",
                "Think Again",
                "Level Up",
                "Being There",
                "Hold Yourself",
                "Well...",
                "This Is It",
                "Success",
                "Go For It",
                "Nature Walk",
                "Drink Water",
                "With Care",
                "With Love",
                "Get There",
                "Go For It",
                "Once Again",
                "Fabulous",
                "WonderFul",
                "End It",
                "Stay Safe",
                "2021",
                "September"};

        Random random = new Random();
        int index = random.nextInt(words.length);

        return words[index];
        }
    }