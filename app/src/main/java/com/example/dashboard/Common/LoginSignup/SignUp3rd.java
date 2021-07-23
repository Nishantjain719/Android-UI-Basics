package com.example.dashboard.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;

import com.example.dashboard.R;

public class SignUp3rd extends AppCompatActivity {
    Button next, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up3rd);

        next = findViewById(R.id.signup_next_button);
        login = findViewById(R.id.signup_login_button);
    }

    public void callVerifyOtpScreen(View view) {
        Intent intent = new Intent(getApplicationContext(), VerifyOTP.class);
        // Add Transition
        Pair[] pairs = new Pair[2];

        pairs[0] = new Pair<View, String>(next, "transition-title_text");
        pairs[1] = new Pair<View, String>(login, "transition_next_btn");

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options =  ActivityOptions.makeSceneTransitionAnimation(SignUp3rd.this, pairs);
            startActivity(intent, options.toBundle());
        }
        else {
            startActivity(intent);
        }

    }
}