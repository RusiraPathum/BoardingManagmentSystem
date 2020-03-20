package com.example.boardingmanagmentsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class homepageActivity extends AppCompatActivity {

    TextView login_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        login_text = (TextView) findViewById(R.id.login_text);

        login_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(homepageActivity.this, loginpageActivity.class);
                startActivity(i);
            }
        });

    }
}
