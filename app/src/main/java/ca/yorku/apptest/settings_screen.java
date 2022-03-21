package ca.yorku.apptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class settings_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_screen);

        Button logout = (Button) findViewById(R.id.logout_button);


// To make the logout button work
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent images_screen = new Intent(settings_screen.this, MainActivity.class);
                startActivity(images_screen);
            }
        });
    }
}