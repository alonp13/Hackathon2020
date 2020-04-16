package com.example.quick_shop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ProductListAdapter extends ArrayAdapter<Product> {

    private static final String TAG = "ProductListAdapter";
    private Context mContext;
    int mResource;

    public ProductListAdapter( Context context, int resource,  ArrayList<Product> objects) {
        super(context, resource, objects);
        mContext=context;
        mResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        String product = getItem(position).getName();
        String brand = getItem(position).getBrand();
        Product p = new Product(product , brand);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent , false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvbrand = (TextView) convertView.findViewById(R.id.textView2);

        tvName.setText(product);
        tvbrand.setText(brand);

        return  convertView;

    }
}
