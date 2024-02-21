package com.example.medidoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PatientDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_dashboard);

        // Get the username from the intent
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        // Set the welcome message dynamically
        TextView textViewWelcome = findViewById(R.id.textViewWelcome);
        if (username != null && !username.isEmpty()) {
            textViewWelcome.setText("Hello " + username);
        } else {
            textViewWelcome.setText("Hello User");
        }

        // Get the button references
        Button buttonUpload = findViewById(R.id.buttonUploadDocuments);
        Button buttonDownload = findViewById(R.id.buttonDownloadDocuments);

        // Set click listener for the Download button
        buttonDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to ImageViewActivity
                Intent imageViewIntent = new Intent(PatientDashboardActivity.this, ImageViewActivity.class);
                startActivity(imageViewIntent);
            }
        });
    }
}
