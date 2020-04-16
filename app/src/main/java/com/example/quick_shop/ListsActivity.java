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
        setContentView(R.layout.activity_lists);

        createListBtn = (Button) findViewById(R.id.createListBtn);
        createListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMarketActivity();
            }
        });
    }
    private void openMarketActivity() {

        Intent intent = new Intent(this, MarketActivity.class);
        startActivity(intent);
    }
}
