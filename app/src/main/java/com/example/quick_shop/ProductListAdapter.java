package com.example.quick_shop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class ProductListAdapter extends ArrayAdapter<Product> {

    private static final String TAG = "ProductListAdapter";
    private Context mContext;
    int mResource;

    public ProductListAdapter( Context context, int resource,  List<Product> objects) {
        super(context, resource, objects);
        mContext=context;
        mResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        String product = getItem(position).getName();
        String brand = getItem(position).getBrand();
        String category = getItem(position).getCategory().toString();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent , false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvBrand = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvCategory = (TextView) convertView.findViewById(R.id.textView3) ;

        tvName.setText(product);
        tvBrand.setText(brand);
        tvCategory.setText(category);

        return  convertView;

    }
}
