package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        TextView text = (TextView) findViewById(R.id.textView5);

        //text that makes bullet points
        text.setText("\u2022 Email: \t contact@netflix.com\n\u2022 Phone: \t (0) 301 928 19");
    }

    public void sendPressed(View view)
    {
        //find views
        EditText email = (EditText) findViewById(R.id.editText3);
        EditText message = (EditText) findViewById(R.id.editText2);
        String emailContent = email.getText().toString();
        String messageContent = message.getText().toString();

        if(emailContent != null && messageContent != null)
        {
            message.getText().clear();
            email.getText().clear();
            Toast.makeText(this, "Sent!", Toast.LENGTH_SHORT).show();
        } else

        {
            Toast.makeText(this, "Fill out both forms!", Toast.LENGTH_LONG).show();
        }
    }
}
