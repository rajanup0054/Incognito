package com.example.medidoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    private Button buttonLogin;
    private TextView textViewPatientLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Find views by their IDs
        buttonLogin = findViewById(R.id.buttonLogin);
        textViewPatientLogin = findViewById(R.id.textViewPatientLogin);

        // Specialist registration TextView click listener
        TextView textViewSpecialistRegister = findViewById(R.id.textViewSpecialistRegister);
        textViewSpecialistRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to specialist registration
                Intent intent = new Intent(Home.this, SpecialistRegistrationActivity.class);
                startActivity(intent);
            }
        });

        // Set onClickListener for the Patient Login TextView
        textViewPatientLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to Patient Login activity
                Intent intent = new Intent(Home.this, PatientLoginActivity.class);
                startActivity(intent);
            }
        });

        // Set onClickListener for the login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to FeaturesActivity
                EditText editTextUsername = findViewById(R.id.editTextUsername);
                String username = editTextUsername.getText().toString();
                Intent intent = new Intent(Home.this, FeaturesActivity.class);
                intent.putExtra("username", username); // Pass the username to FeaturesActivity
                startActivity(intent);
            }
        });
    }
}
