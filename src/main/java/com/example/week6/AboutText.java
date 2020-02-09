package com.example.week6;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AboutText {

    private Context context;

    public AboutText(Context context)
    {
        this.context = context;

    }

    //Method that reads in a text file
    public List<String> read(String path)
    {
        List<String> text = new ArrayList<>();

        try {
            //opens up the file from the assets
            InputStream input = context.getAssets().open(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line;

            while ((line = reader.readLine()) != null)
                text.add(line);


    } catch (IOException e)
    {

    }
        return text;

    }




}
