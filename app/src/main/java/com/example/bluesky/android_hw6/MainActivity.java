package com.example.bluesky.android_hw6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

   private Button add;
   private ListView note_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,AddNote.class);
            startActivity(intent);
        }
    };
    private void findViews()
    {
        add = (Button)findViewById(R.id.button_add);
        add.setOnClickListener(click);
        note_list = (ListView)findViewById(R.id.listView);
    }
}
