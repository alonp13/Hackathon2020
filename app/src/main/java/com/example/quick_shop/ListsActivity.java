package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class ListsActivity extends AppCompatActivity {

    private Button createListBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
