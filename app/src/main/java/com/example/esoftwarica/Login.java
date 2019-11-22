package com.example.esoftwarica;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity implements View.OnClickListener {
    private EditText uname;
    private EditText password;
    private Button btnlogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.loginpage);

        getSupportActionBar ().hide ();

        uname = (EditText) findViewById (R.id.username);
        password = (EditText) findViewById (R.id.password);
        btnlogin = (Button) findViewById (R.id.btnlogin);

        btnlogin.setOnClickListener (this);

    }


    @Override
    public void onClick(View v) {
        String username = uname.getText ().toString ();
        String pwd = password.getText ().toString ();
        if(username.equals ("softwarica") && pwd.equals ("coventry")){
            Intent i = new Intent (this, MainActivity.class);
            startActivity (i);
        }
        else
        {
            Toast.makeText (getApplicationContext (),"Failed to Login",Toast.LENGTH_SHORT).show ();
        }

    }
}

