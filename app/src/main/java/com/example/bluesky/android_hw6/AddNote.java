package com.example.bluesky.android_hw6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AddNote extends AppCompatActivity {

    EditText edit_title;
    EditText edit_content;
    TextView title;
    TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
        Views();
    }
    private void Views()
    {
        edit_title = (EditText)findViewById(R.id.edit_title);
        edit_content = (EditText)findViewById(R.id.edit_content);
        title = (TextView)findViewById(R.id.title);
        content = (TextView)findViewById(R.id.content);
    }
}
