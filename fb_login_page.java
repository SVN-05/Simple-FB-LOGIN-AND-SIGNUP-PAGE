package com.example.mycaptain_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fb_login_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fb_login_page);
    }

    public void create_account(View view) {
        Intent intent = new Intent(getApplicationContext(), Signup_Page_Fb.class);
        startActivity(intent);
    }
}