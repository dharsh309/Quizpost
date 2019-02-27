package com.example.india.quizpost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ForgetPassword extends AppCompatActivity {

    EditText user_email,change_password,confirm_password;
    Button forgetPassword_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        user_email=findViewById(R.id.user_email);
        change_password=findViewById(R.id.change_password);
        confirm_password=findViewById(R.id.confirm_password);
        forgetPassword_submit=findViewById(R.id.forgetPassword_submit);

        forgetPassword_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgetPassword.this,Login.class);
                startActivity(intent);

            }
        });
    }
}
