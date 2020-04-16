package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChooseMarketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Choose Supermarket");
        setContentView(R.layout.activity_choose_market);

        ListView marketsList = (ListView) findViewById(R.id.marketsList);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,getMarkets());

        marketsList.setAdapter(arrayAdapter);

        marketsList.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ChooseMarketActivity.this,MarketActivity.class);
                intent.putExtra("com.example.quick_shop.MARKET_CHOSE", getMarkets().get(position));
                startActivity(intent);
            }
        });
    }

    private List<Supermarket> getMarkets() {
        List<Supermarket> markets = Arrays.asList(TempData.markets);
        return markets;
    }
}
