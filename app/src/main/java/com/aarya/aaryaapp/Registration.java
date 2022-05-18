package com.aarya.aaryaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.aarya.aaryaapp.Models.Users;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Registration extends AppCompatActivity {
    Button btn2_signup;
    EditText mEmail, pass_word, mFullName, mPhone;
    TextView mCreateText;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);




        mFullName = findViewById(R.id.fullName);
        mEmail=findViewById(R.id.email);
        pass_word=findViewById(R.id.password);
        mPhone = findViewById(R.id.phone);
        btn2_signup=findViewById(R.id.registerbtn);
        mCreateText = findViewById(R.id.createText);

        mAuth=FirebaseAuth.getInstance();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        btn2_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mEmail.getText().toString().trim();
                String password= pass_word.getText().toString().trim();
                String phoneNumber = mPhone.getText().toString().trim();
                String fullname = mFullName.getText().toString().trim();

                //Making fields mandatory

                if (TextUtils.isEmpty(fullname)) {
                    mFullName.setError("Full Name is Required.");
                    mFullName.requestFocus();
                    return;

                }

                if(email.isEmpty())
                {
                    mEmail.setError("Email is empty");
                    mEmail.requestFocus();
                    return;
                }
                if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
                {
                    mEmail.setError("Enter the valid email address");
                    mEmail.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(phoneNumber)) {
                    mPhone.setError("Phone Number is Required.");
                    mPhone.requestFocus();
                    return;

                }

                if(password.isEmpty())
                {
                    pass_word.setError("Enter the password");
                    pass_word.requestFocus();
                    return;
                }
                if(password.length()<6)
                {
                    pass_word.setError("Length of the password should be more than 6");
                    pass_word.requestFocus();
                    return;
                }
//
                mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Users user = new Users(mEmail.getText().toString(),pass_word.getText().toString());
                            String id =  task.getResult().getUser().getUid();
                            database.getReference().child("Users").child(id).setValue(user);

                            Toast.makeText(Registration.this, "User Created.", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));

                        } else {
                            Toast.makeText(Registration.this, "Error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });


            }
        });
        mCreateText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Login.class));

            }
        });
    }
}

