package ca.yorku.apptest;

import android.content.Intent;
import android.os.Environment;
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


        Button vault = (Button) findViewById(R.id.vault_button);


        Button settings = (Button) findViewById(R.id.setting_button);




// Button to access Images

        images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent images_screen = new Intent(home_screen.this, images_screen.class);
                startActivity(images_screen);
            }
        });

// Button to access Vault
        vault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vault_screen = new Intent(home_screen.this, vault_screen.class);
                String way = Environment.getExternalStorageDirectory().getPath();
                getIntent().putExtra("way",way);
                startActivity(vault_screen);



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