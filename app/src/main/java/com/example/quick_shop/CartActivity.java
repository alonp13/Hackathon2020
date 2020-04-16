package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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




    }
}
