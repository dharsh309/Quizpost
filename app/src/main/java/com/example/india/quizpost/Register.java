package com.example.india.quizpost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Register extends AppCompatActivity {
    EditText name,mobileno,email,rollno,password;
    Button submitbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=findViewById(R.id.name);
        mobileno=findViewById(R.id.mobileno);
        email=findViewById(R.id.email);
        rollno=findViewById(R.id.rollno);
        password=findViewById(R.id.password);
        submitbutton=findViewById(R.id.submitbutton);

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1=name.getText().toString();
                String mobileno1=mobileno.getText().toString();
                String password1=password.getText().toString();
                String email1=email.getText().toString();
                String rollno1=rollno.getText().toString();

                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                if (!email1.matches(emailPattern))
                {
                    email.setError("enter correct format of email");
                    return;
                }

                if (!name1.isEmpty())
                {
                    name.setError("Enter Name ");
                    return;
                }
                if (rollno1.isEmpty())
                {
                    rollno.setError("Rollno Require");
                    return;
                }

                if (mobileno1.isEmpty()&&mobileno1.length()<=10)
                {
                    mobileno.setError("Require Phone no ");
                    return;
                }
                if (password1.isEmpty())
                {
                    password.setError("Enter Password ");
                    return;
                }
                Intent intent = new Intent(Register.this,Login.class);
                startActivity(intent);

            }
        });
    }
}
