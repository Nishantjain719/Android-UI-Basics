package com.example.dashboard.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dashboard.R;

public class SetNewPassword extends AppCompatActivity {
    Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_new_password);

        okBtn = findViewById(R.id.ok_btn);
    }

    public void callSuccessPassScreen(View view) {
        Intent intent = new Intent(getApplicationContext(), ForgetPassSuccessMessage.class);
        startActivity(intent);
    }
}