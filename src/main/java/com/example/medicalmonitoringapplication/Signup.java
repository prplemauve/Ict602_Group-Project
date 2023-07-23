package com.example.medicalmonitoringapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.medicalmonitoringapplication.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Signup extends AppCompatActivity {

    EditText name, email, password, contact;
    Button register;
    FirebaseAuth mFirebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        //getSupportActionBar().setTitle("Sign Up");

        mFirebaseAuth = FirebaseAuth.getInstance();
        name= findViewById(R.id.fname);
        password = findViewById(R.id.passwd);
        register = findViewById(R.id.regs);
        email= findViewById(R.id.uemail);
        contact= findViewById(R.id.contactno);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mailid = email.getText().toString();
                String pwd = password.getText().toString();
                String fullName = name.getText().toString();
                String contactno= contact.getText().toString();
                if(fullName.isEmpty()){
                    name.setError("Please enter the Name");
                    name.requestFocus();
                }
                else if (mailid.isEmpty()){
                    email.setError("Please enter the email");
                    email.requestFocus();
                }
                else if (contactno.isEmpty()){
                    password.setError("Please enter the contact no.");
                    password.requestFocus();
                }
                else if (pwd.isEmpty()){
                    password.setError("Please Enter the Password.");
                    password.requestFocus();
                }
                else {
                    mFirebaseAuth.createUserWithEmailAndPassword(mailid, pwd).addOnCompleteListener(Signup.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(Signup.this, "Registration Unsuccessful, Please Try again!", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                startActivity(new Intent(Signup.this, Home.class));
                            }
                        }
                    });
                }
            }
        });
    }
}