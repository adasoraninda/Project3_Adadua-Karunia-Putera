package com.vsgajmpa.countrylistview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listCountry = findViewById(R.id.list_view_country);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                CountryResources.getCountries());

        listCountry.setAdapter(adapter);

        listCountry.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this,
                    CountryResources.getCountries().get(position),
                    Toast.LENGTH_SHORT)
                    .show();
        });
    }
}