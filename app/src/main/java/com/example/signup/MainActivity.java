package com.example.signup;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText pass;
    private int text;
    TextView tv1,tv2;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_main);
    }

    public void validateEmailAdd(View v) {
        email = findViewById(R.id.emailid);
        pass = findViewById(R.id.Password);
        String emailInput = email.getText().toString();
        String passInput = pass.getText().toString();
        if (!passInput.isEmpty() && !emailInput.isEmpty()) {
            if (Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
                Toast.makeText(this, "Login Successfull!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Enter Valid Email!", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Enter Valid Details", Toast.LENGTH_SHORT).show();
        }

    }

    public void ownerSignUp(View view) {
        startActivity(new Intent(MainActivity.this,Ownersignup.class));
    }

    public void OpenSignupPage(View view) {
        startActivity(new Intent(MainActivity.this,SignupActivity.class));
    }
}
