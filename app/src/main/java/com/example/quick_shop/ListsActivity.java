package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListsActivity extends AppCompatActivity {
    Button createListBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Let's Shop");
        setContentView(R.layout.activity_lists);

        createListBtn = (Button) findViewById(R.id.createListBtn);
        createListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChooseMarketActivity();
            }
        });
    }
    private void openChooseMarketActivity() {

        Intent intent = new Intent(this, CartActivity.class);
        startActivity(intent);
    }
}
