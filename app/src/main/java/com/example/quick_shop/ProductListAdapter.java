package com.example.quick_shop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class ProductListAdapter extends ArrayAdapter<Product> {

    private static final String TAG = "ProductListAdapter";

    private Context mContext;
    private int mResource;

    private CheckBox checkBox;
    private TextView tvName;
    private TextView tvBrand;
    private TextView tvCategory;
    private ArrayList<Product> productsSelected = new ArrayList<Product>();

    public ProductListAdapter(Context context, int resource,  List<Product> objects) {
        super(context, resource, objects);
        mContext=context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        final Product currProduct =  getItem(position);
        String product = currProduct.getName();
        String brand = currProduct.getBrand();
        String category = currProduct.getCategory().toString();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent , false);

        tvName = (TextView) convertView.findViewById(R.id.textView1);
        tvBrand = (TextView) convertView.findViewById(R.id.textView2);
        tvCategory = (TextView) convertView.findViewById(R.id.textView3) ;
        checkBox = (CheckBox) convertView.findViewById(R.id.checkBox);

        tvName.setText(product);
        tvBrand.setText(brand);
        tvCategory.setText(category);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked) {
                    if(!productsSelected.contains(currProduct)) {
                        productsSelected.add(currProduct);
                    }
                } else {
                    productsSelected.remove(currProduct);
                }
            }
        });
        return  convertView;
    }

    public ArrayList<Product> getProductsSelected(){
        return productsSelected;
    }
}
