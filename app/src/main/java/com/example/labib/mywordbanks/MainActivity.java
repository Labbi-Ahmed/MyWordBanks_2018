package com.example.labib.mywordbanks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button save_new_word , update_this_word;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        


        save_new_word = (Button) findViewById(R.id.save_new_word);
        update_this_word = (Button)findViewById(R.id.save_this_word);


        save_new_word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUpdateActivity();
            }
        });

        update_this_word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnterMeaning();
            }
        });

    }

    public void openUpdateActivity(){
        Intent intent = new Intent(this , Update_word.class);
        startActivity(intent);
    }

    public void openEnterMeaning(){
        Intent intent = new Intent(this, EnterMeaning.class);
        startActivity(intent);
    }

}
