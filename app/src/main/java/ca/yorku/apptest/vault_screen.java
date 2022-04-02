package ca.yorku.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.io.File;

public class vault_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vault_screen);

        RecyclerView recycler = findViewById(R.id.recycler);
        TextView files_text = findViewById(R.id.file_view);

        String route = getIntent().getStringExtra("route");

        File source = new File(route);
        File[] documents = source.listFiles();

        if(documents==null||documents.length==0){
            files_text.setVisibility(View.VISIBLE);
            return;
        }

        files_text.setVisibility(View.INVISIBLE);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new recycle_adapter(getApplicationContext(),FnF));

    }
}