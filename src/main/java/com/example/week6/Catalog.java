package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

public class Catalog extends AppCompatActivity {

    private boolean isFavorit = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
    }

    public void changeToTeen(View view)
    {
        ImageView favorit = (ImageView) findViewById(R.id.imageView2);
        ImageView teens = (ImageView) findViewById(R.id.imageView3);

        if(isFavorit)
        {
            //shift imageview
            favorit.animate().alpha(0);
            teens.animate().alpha(1);
            //shift button text
            Button button = (Button) findViewById(R.id.button5);
            button.setText("Favorits");
            //shift text
            TextView text = (TextView) findViewById(R.id.catalog2);
            text.setText("Teen movies");
            isFavorit = false;

        } else
        {
            favorit.animate().alpha(1);
            teens.animate().alpha(0);
            Button button = (Button) findViewById(R.id.button5);
            button.setText("Teen movies");
            TextView text = (TextView) findViewById(R.id.catalog2);
            text.setText("All time favortis");
            isFavorit = true;

        }

    }
}
