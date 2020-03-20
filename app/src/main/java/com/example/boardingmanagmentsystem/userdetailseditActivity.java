package com.example.boardingmanagmentsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class userdetailseditActivity extends AppCompatActivity {

    ImageView login_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdetailsedit);

        login_logo = (ImageView) findViewById(R.id.login_logo);

        login_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(userdetailseditActivity.this, loginpageActivity.class);
                startActivity(i);
            }
        });

    }
}
