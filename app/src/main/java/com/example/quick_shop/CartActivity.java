package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {
    private static final String TAG = "CartActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        Log.d(TAG, "onCreats: Started.");
        ListView listView = (ListView) findViewById(R.id.listview);

        ProductListAdapter adapter = new ProductListAdapter(this, R.layout.adapter_veiw_layout, TempData.products);
        listView.setAdapter(adapter);
        Button btn = (Button) findViewById(R.id.btnButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChooseMarketActivity();
            }
        });

    }
    private void openChooseMarketActivity() {
        Intent intent = new Intent(this, ChooseMarketActivity.class);
        startActivity(intent);
    }
}
