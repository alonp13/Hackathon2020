package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListsActivity extends AppCompatActivity {
    //createListBtn
    private  Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        btn = (Button) findViewById(R.id.createListBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListsActivity();
            }
        });
    }

    private void openListsActivity() {
        Intent intent = new Intent(this, CartActivity.class);
        startActivity(intent);
    }
}
