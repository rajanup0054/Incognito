package com.example.medidoc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FeaturesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_features);

        // Find views by their IDs
        TextView textViewWelcomeFeatures = findViewById(R.id.textViewWelcomeFeatures);
        Button buttonUploadFeatures = findViewById(R.id.buttonUploadFeatures);
        Button buttonDownloadFeatures = findViewById(R.id.buttonDownloadFeatures);

        // Retrieve username from the intent
        Intent intent = getIntent();
        if (intent.hasExtra("username")) {
            String username = intent.getStringExtra("username");
            // Set the welcome message dynamically
            textViewWelcomeFeatures.setText("Welcome, " + username);
        }

        // Set click listener for the Upload button (you can add functionality here)
        buttonUploadFeatures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement upload feature
                // You can open a file picker or perform other actions here
            }
        });

        // Set click listener for the Download button
        buttonDownloadFeatures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start PrescriptionActivity
                Intent prescriptionIntent = new Intent(FeaturesActivity.this, PrescriptionActivity.class);
                startActivity(prescriptionIntent);
            }
        });
    }
}
