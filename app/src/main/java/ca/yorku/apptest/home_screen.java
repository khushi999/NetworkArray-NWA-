package ca.yorku.apptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        // To set the images button according to the id

        Button images = (Button) findViewById(R.id.images_button);


        Button documents = (Button) findViewById(R.id.document_button);

        Button notes = (Button) findViewById(R.id.notes_button);

        Button settings = (Button) findViewById(R.id.setting_button);




// Button to access Images

        images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent images_screen = new Intent(home_screen.this, images_screen.class);
                startActivity(images_screen);
            }
        });

// Button to access Documents
        documents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent documents_screen = new Intent(home_screen.this, documents_screen.class);
                startActivity(documents_screen);


            }
        });
// Button to access Notes
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent notes_screen = new Intent(home_screen.this, notes_screen.class);
                startActivity(notes_screen);


            }
        });
// Button to access Settings
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings_screen = new Intent(home_screen.this, settings_screen.class);
                startActivity(settings_screen);


            }
        });
    }

    // Disable back button on home screen so the user is not taken back to the login screen
    @Override
    public void onBackPressed() {
    }
}