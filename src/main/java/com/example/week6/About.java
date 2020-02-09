package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class About extends AppCompatActivity {

    private final String path = "AboutText.txt";
    private AboutText aboutText;
    private List<String> lines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView text = (TextView) findViewById(R.id.textView3);


        aboutText = new AboutText(this);

        //reads the text file and set the textview to the content of the file
        lines = aboutText.read(path);
        for(String s : lines)
        {
            text.setText(s);
        }

       text.setMovementMethod(new ScrollingMovementMethod());



    }
}
