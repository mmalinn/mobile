package com.example.carsparts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CarCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_category);
        ArrayAdapter<Car> listAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Car.cars);
        ListView listCars = (ListView) findViewById(R.id.list_car);
        listCars.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> listCars, View itemView, int position, long id) {
                Intent intent = new Intent(CarCategoryActivity.this, CarActivity.class);
                intent.putExtra(CarActivity.EXTRA_CARID, (int) id);
                startActivity(intent);
            }
        };
        listCars.setOnItemClickListener(itemClickListener);
    }
}