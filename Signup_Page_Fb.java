
package com.example.mycaptain_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Signup_Page_Fb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup__page__fb);
    }

    public void back(View view) {
        Intent intent = new Intent(getApplicationContext(), fb_login_page.class);
        startActivity(intent);
    }
}