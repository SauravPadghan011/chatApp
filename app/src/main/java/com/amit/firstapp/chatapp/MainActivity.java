package com.amit.firstapp.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputMobile = findViewById(R.id.input_mobile);                   // Input mobile number variable
        final Button buttonGetOTP = findViewById(R.id.continue_btn);                    // Submit button variable

        buttonGetOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // If user input is empty then show pop up "Enter Mobile"
                if(inputMobile.getText().toString().trim().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter Mobile", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Start next activity after entering mobile number
                Intent intent = new Intent(getApplicationContext(), activity_otp.class);
//                intent.putExtra("mobile", inputMobile.getText().toString());
                startActivity(intent);
            }
        });
    }
}