package com.example.india.quizpost;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class Login extends AppCompatActivity {

CircleImageView CircleLogo;
EditText user,pass;
Button loginButton;
TextView register,forgetPassword,pariksha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user=findViewById(R.id.user);
        pass=findViewById(R.id.pass);
        pariksha=findViewById(R.id.pariksha);
        CircleLogo=findViewById(R.id.CircleLogo);
        loginButton=findViewById(R.id.loginbutton);
        register=findViewById(R.id.register);
        forgetPassword=findViewById(R.id.forgetPassword);



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Register.class);
                startActivity(intent);

            }
        });

        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,ForgetPassword.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Successfull", Toast.LENGTH_SHORT).show();

            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user1 =  user.getText().toString();
                String pass1 = pass.getText().toString();


                if (!user1.equals("12345678"))
                {
                    user.setError("rollno not matched ");
                    return;
                }

                if (pass1.isEmpty())
                {
                    pass.setError("enter password");
                    return;
                }

                Intent intent = new Intent(Login.this,Levels.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
