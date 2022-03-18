package ca.yorku.apptest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        EditText username = (EditText) findViewById(R.id.username);

        EditText password = (EditText) findViewById(R.id.password);

        Button login = (Button) findViewById(R.id.login_button);

        // Now to make the login button work
        // Pass in the username.toString variable and password.toString variable as a parameter

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // If statement to check whether or not the Username/Password match the following info
                if ((username.getText().toString().equals("root")) && (password.getText().toString().equals("toor"))) {
                // Intent is used to move from one screen to another. Requires 2 parameters(Initial Screen, Second Screen)
                Intent second_screen = new Intent(MainActivity.this, home_screen.class);
                startActivity(second_screen);
            }else
                // Disable the login button if the info is wrong
                // We can implement a counter to keep track of the number of wrong login attempts

                login.setEnabled(false);
            }
        });
    }
}