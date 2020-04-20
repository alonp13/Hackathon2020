package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class CartActivity extends AppCompatActivity {

    private static final String TAG = "CartActivity";

    private ListView listView;
    private Button finishBtn;
    private EditText filterEditText;
    private boolean filterClicked;

    private ProductListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_cart);
        listView = (ListView) findViewById(R.id.listview);
        filterEditText = (EditText) findViewById(R.id.filtersearch);

        filterClicked = false;
        filterEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!filterClicked) {
                    filterEditText.setText("");
                    filterEditText.setTextColor(Color.BLACK);
                    filterEditText.setTextSize(20);
                    filterClicked = true;
                }
            }
        });

        adapter = new ProductListAdapter(this, R.layout.adapter_view_layout, TempData.products);
        listView.setAdapter(adapter);

        finishBtn = new Button(this);
        finishBtn.setBackgroundResource(R.drawable.button_color);
        finishBtn.setTextColor(Color.WHITE);
        finishBtn.setText("Finish");

        listView.addFooterView(finishBtn);

        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChooseMarketActivity();
            }
        });

        filterEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                (CartActivity.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void openChooseMarketActivity() {
        Intent intent = new Intent(this, ChooseMarketActivity.class);
        intent.putExtra("com.example.quick_shop.PRODUCTS_SELECTED",adapter.getProductsSelected());
        startActivity(intent);
    }
}
