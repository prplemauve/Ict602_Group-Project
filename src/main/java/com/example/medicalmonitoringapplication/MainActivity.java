package com.example.medicalmonitoringapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    Button signup_button;

    private static final String EMPTY = "Empty Input!";

    private Button btnLogin;
    private EditText edLoginEmail, edLoginPassword;
    private FirebaseAuth mAuth;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get firebase instance
        mAuth = FirebaseAuth.getInstance();

        btnLogin = findViewById(R.id.btnLogin);
        edLoginEmail = findViewById(R.id.edLoginEmail);
        edLoginPassword = findViewById(R.id.edLoginPassword);

        // trigger login button
        btnLogin.setOnClickListener(view -> {

            // check empty input params
            if (emptyValidation()) {

                // sign in via firebase
                mAuth.signInWithEmailAndPassword(edLoginEmail.getText().toString(), edLoginPassword.getText().toString())
                        .addOnCompleteListener(this, task -> {

                            // if success login, intent to MainActivity2
                            if (task.isSuccessful()) {
                                Intent intent = new Intent(this, Home.class);
                                startActivity(intent);
                            }
                            // login fail, prompt error
                            else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                                builder.setTitle("Incorrect Email or Password.");
                                AlertDialog dialog = builder.create();
                                dialog.show();
                            }
                        });
            }
        });

        signup_button = (Button) findViewById(R.id.signup_button);
        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Signup.class);
                startActivity(intent);

            }
        });


    }

    private boolean emptyValidation() {

        boolean pass = true;

        if (edLoginEmail.getText().length() == 0) {
            edLoginEmail.setError(EMPTY);
            pass = false;
        }

        if (edLoginPassword.getText().length() == 0) {
            edLoginPassword.setError(EMPTY);
            pass = false;
        }

        return pass;
    }
}