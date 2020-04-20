package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChooseMarketActivity extends AppCompatActivity {

    private ListView marketsList;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_choose_market);

        marketsList = (ListView) findViewById(R.id.marketsList);
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,getMarkets());

        marketsList.setAdapter(arrayAdapter);
        marketsList.setOnItemClickListener(new ListView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ChooseMarketActivity.this,MarketActivity.class);

                Supermarket marketChose = getMarkets().get(position); // Should be from Database
                ArrayList<Product> productsSelected = (ArrayList<Product>) getIntent().getExtras().get("com.example.quick_shop.PRODUCTS_SELECTED");

                intent.putExtra("com.example.quick_shop.MARKET_SELECTED", marketChose);
                intent.putExtra("com.example.quick_shop.PRODUCTS_SELECTED", productsSelected);

                startActivity(intent);
            }
        });
    }

    private List<Supermarket> getMarkets() {
        List<Supermarket> markets = Arrays.asList(TempData.markets);
        return markets;
    }
}
