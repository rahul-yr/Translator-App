package com.example.andriod.translator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         TextView numbersTextView=(TextView)findViewById(R.id.numbers);
        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent numbersIntent=new Intent(MainActivity.this,NumbersActivity.class);
                       startActivity(numbersIntent);
                Toast.makeText(v.getContext(),"Welcome to Numbers Translator",Toast.LENGTH_SHORT).show();
            }
        });

        TextView phrasesTextView=(TextView) findViewById(R.id.phrases);
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
            Toast.makeText(view.getContext(),"Welcome to Phrases Translator",Toast.LENGTH_SHORT).show();
            }
        });


         TextView colorsTextView=(TextView)findViewById(R.id.colors);
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent =new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
                      Toast.makeText(view.getContext(),"Welcome to Colors Translator",Toast.LENGTH_SHORT).show();

            }
        });

        TextView familyTextView=(TextView)findViewById(R.id.family);
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
                Toast.makeText(view.getContext(),"Welcome to Family Relations Translator",Toast.LENGTH_SHORT).show();

            }
        });


    }

//    public void openNumbersList(View view) {
//        Intent intent=new Intent(view.getContext(),NumbersActivity.class);
//        startActivity(intent);
//       Toast.makeText(getApplicationContext(),"Welcome to Numbers Translator",Toast.LENGTH_SHORT).show();
//    }
//
//    public void openFamilyMembers(View view) {
//        Intent intent=new Intent(view.getContext(),FamilyActivity.class);
//        startActivity(intent);
//      Toast.makeText(getApplicationContext(),"Welcome to Family Relations Translator",Toast.LENGTH_SHORT).show();
//    }
//
//    public void openColors(View view) {
//        Intent intent =new Intent(view.getContext(),ColorsActivity.class);
//        startActivity(intent);
//       Toast.makeText(getApplicationContext(),"Welcome to Colors Translator",Toast.LENGTH_SHORT).show();
//    }
//    public void openPhrases(View view){
//        Intent intent=new Intent(view.getContext(),PhrasesActivity.class);
//        startActivity(intent);
//       Toast.makeText(getApplicationContext(),"Welcome to Phrases Translator",Toast.LENGTH_SHORT).show();
//
//    }
}
