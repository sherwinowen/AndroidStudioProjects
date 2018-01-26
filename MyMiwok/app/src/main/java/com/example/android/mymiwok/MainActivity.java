package com.example.android.mymiwok;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        // Find the View that shows the numbers category
        TextView numbers = (TextView)findViewById(R.id.numbers);

        // Create a new intent to open the {@link NumbersActivity}
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);

                // Create a new intent to open the {@link NumbersActivity}
                startActivity(numbersIntent);
            }
        });


        // Find the View that shows the family members category
        TextView family = (TextView)findViewById(R.id.family);

        // Create a new intent to open the {@link NumbersActivity}
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);

                // Create a new intent to open the {@link NumbersActivity}
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the colors category
        TextView colors = (TextView)findViewById(R.id.colors);

        // Create a new intent to open the {@link ColorsActivity}
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent(MainActivity.this,ColorsActivity.class);

                // Create a new intent to open the {@link NumbersActivity}
                startActivity(colorsIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView phrases = (TextView)findViewById(R.id.phrases);

        // Create a new intent to open the {@link PhrasesActivity}
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent(MainActivity.this,PharasesActivity.class);

                // Create a new intent to open the {@link NumbersActivity}
                startActivity(phrasesIntent);
            }
        });


    }
}
