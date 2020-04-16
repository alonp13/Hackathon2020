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

        //types of products
        Product p1 = new Product("milk" , "milk");
        Product p2 = new Product("blue cheese" , "milk");
        Product p3 = new Product("cheese" , "milk");
        Product p4 = new Product("brad" , "brad");
        Product p5 = new Product("hamborger" , "meat");
        Product p6 = new Product("staek" , "meat");

        ArrayList <Product> products = new ArrayList<>();
        //add to list
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);

        ProductListAdapter adapter = new ProductListAdapter(this, R.layout.adapter_veiw_layout,products );
        listView.setAdapter(adapter);




    }
}
