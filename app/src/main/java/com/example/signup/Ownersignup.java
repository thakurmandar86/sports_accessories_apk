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

public class Ownersignup extends AppCompatActivity {
    EditText ownername;
    EditText owneremail;
    EditText ownerpassword;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_ownersignup);

    }
    public void Ownervalidation(View view){
        ownername=findViewById(R.id.ownername);
        owneremail=findViewById(R.id.owneremail);
        ownerpassword=findViewById(R.id.ownerpassword);
        String Oname= ownername.getText().toString();
        String Oemail= owneremail.getText().toString();
        String Opass= ownerpassword.getText().toString();
        if (!Oname.isEmpty() && !Oemail.isEmpty() && !Opass.isEmpty()){
            if (Patterns.EMAIL_ADDRESS.matcher((CharSequence) owneremail).matches()){
                Toast.makeText(this,"Registration Successful",Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this,"Enter Valid Email",Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Enter All Details", Toast.LENGTH_SHORT).show();
        }
    }
    public void OpenMainActivity(View view){
        startActivity(new Intent(Ownersignup.this,MainActivity.class));
    }

}
