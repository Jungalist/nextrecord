package com.example.szaman.nextrecord;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainMenu extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.nextrecord.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });}

   /* public void changeTestText(View view) {
        TextView testText = (TextView) findViewById(R.id.tee);
        testText.setText("poo");
    }*/


    public void lookingForRecord(View view){
        Intent intent = new Intent(this, LookingForRecord.class);
        EditText message = (EditText) findViewById(R.id.edit_message);
        intent.putExtra(EXTRA_MESSAGE, message.getText().toString());
        startActivity(intent);
    }


}
