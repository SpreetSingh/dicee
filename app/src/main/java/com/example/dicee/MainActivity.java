package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button newButton;
        newButton= (Button) findViewById(R.id.button);
        ImageView LeftDice=(ImageView) findViewById(R.id.imageView3);
        ImageView RightDice=(ImageView)findViewById(R.id.imageView4);
        int [] dice={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dicee" ,"CLicked");
                Random random=new Random();
                int number =random.nextInt(6);
                LeftDice.setImageResource(dice[number]);
                number = random.nextInt(6);
                RightDice.setImageResource(dice[number]);

            }
        });

    }
}