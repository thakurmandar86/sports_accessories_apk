package com.example.signup;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {
    EditText nameup;
    EditText emailup;
    EditText passup;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_signup);
    }

    public void validation(View view) {
        nameup=findViewById(R.id.ownername);
        emailup=findViewById(R.id.owneremail);
        passup=findViewById(R.id.ownerpassword);
        String nameInputup=nameup.getText().toString();
        String emailInputup=emailup.getText().toString();
        String passInputup=passup.getText().toString();

        if(!nameInputup.isEmpty() && !emailInputup.isEmpty() && !passInputup.isEmpty()) {

            if (Patterns.EMAIL_ADDRESS.matcher(emailInputup).matches()) {
                Toast.makeText(this, "SignUp Successfull!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Enter Valid Email!", Toast.LENGTH_SHORT).show();
            } }
            else
                {
                Toast.makeText(this,"Enter All Details!",Toast.LENGTH_SHORT).show();
            }

        }

    public void OpenSigninPage(View view) {
        startActivity(new Intent(SignupActivity.this,MainActivity.class));
    }
}