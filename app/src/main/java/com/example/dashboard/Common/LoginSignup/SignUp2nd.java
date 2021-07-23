package com.example.dashboard.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dashboard.R;

public class SignUp2nd extends AppCompatActivity {

    ImageView backBtn;
    Button next, login;
    TextView titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up2nd);

        //Hooks
        backBtn = findViewById(R.id.signup_back_button);
        next = findViewById(R.id.signup_next_button);
        login = findViewById(R.id.signup_login_button);
        titleText = findViewById(R.id.signup_title_text);
    }


    public void callNextSignUp2ndScreen(View view) {
        Intent intent = new Intent(getApplicationContext(), SignUp3rd.class);
        // Add Transition
        Pair[] pairs = new Pair[4];
        pairs[0] = new Pair<View, String>(backBtn, "transition_back_arrow_btn");
        pairs[1] = new Pair<View, String>(next, "transition-title_text");
        pairs[2] = new Pair<View, String>(login, "transition_next_btn");
        pairs[3] = new Pair<View, String>(titleText, "transition_login_btn");

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            ActivityOptions options =  ActivityOptions.makeSceneTransitionAnimation(SignUp2nd.this, pairs);
            startActivity(intent, options.toBundle());
        }
        else {
            startActivity(intent);
        }

    }
}