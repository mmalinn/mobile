package com.example.carsparts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class CarActivity extends Activity {

    public static final String EXTRA_CARID = "carId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        int carId = (Integer)getIntent().getExtras().get(EXTRA_CARID);
        Car car = Car.cars[carId];

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(car.getName());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(car.getDescription());

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(car.getImageResourceId());
        photo.setContentDescription(car.getName());
    }
}