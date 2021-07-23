package com.example.dashboard.Common.LoginSignup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dashboard.R;

public class ForgetPassword extends AppCompatActivity {

Button setForgetPassBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        setForgetPassBtn = findViewById(R.id.forget_pass_next);
}

    public void callSetForgetPassScreen(View view) {
        Intent intent = new Intent(getApplicationContext(), SetNewPassword.class);
        startActivity(intent);
    }


}