package com.example.hackathonproj;
import java.io.*;
import java.util.*;
import java.net.*;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    String[] years = {"1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",
    "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
    "2018", "2019", "2020", "2021", "2022", "2023", "2024"};
    String[] makes = {"Acura", "Alfa Romeo", "Audi", "BMW", "Buick", "Cadillac", "Chevrolet", "Chrysler",
            "Dodge", "Ferrari", "Ford", "GMC", "Honda", "Hyundai", "Infinity", "Jeep", "Lexus", "Lincoln",
    "Mazda", "Mercedes-Benz", "Mercury", "Mitsubishi", "Nissan", "Pontiac",
            "Subaru", "Tesla", "Toyota", "Volkswagon", "Volvo"};
    String[] models;
    AutoCompleteTextView autoCompleteTextView1;
    ArrayAdapter<String> adapterItems1;
    AutoCompleteTextView autoCompleteTextView2;
    ArrayAdapter<String> adapterItems2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView1 = findViewById(R.id.auto_complete_txt1);
        adapterItems1 = new ArrayAdapter<String>(this, R.layout.list_years, years);
        autoCompleteTextView1.setAdapter(adapterItems1);
        autoCompleteTextView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this,"Item: " + item, Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTextView2 = findViewById(R.id.auto_complete_txt2);
        adapterItems2 = new ArrayAdapter<String>(this, R.layout.list_years, makes);
        autoCompleteTextView2.setAdapter(adapterItems2);
        autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this,"Item: " + item, Toast.LENGTH_SHORT).show();
            }
        });
    }

    //this method handles the whole process of searching for and choosing your car
    private Car getCar() throws IOException{
        String[] carInfo = new String[6];
        int carYear = 0;



        carInfo[0] = "" + carYear;
        URL url = null;
        switch(carYear){
            case 1992:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/1992.csv");
                break;
            case 1993:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/1993.csv");
                break;
            case 1994:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/1994.csv");
                break;
            case 1995:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/1995.csv");
                break;
            case 1996:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/1996.csv");
                break;
            case 1997:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/1997.csv");
                break;
            case 1998:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/1998.csv");
                break;
            case 1999:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/1999.csv");
                break;
            case 2000:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2000.csv");
                break;
            case 2001:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2001.csv");
                break;
            case 2002:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/1993.csv");
                break;
            case 2003:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2003.csv");
                break;
            case 2004:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2004.csv");
                break;
            case 2005:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2005.csv");
                break;
            case 2006:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2006.csv");
                break;
            case 2007:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2007.csv");
                break;
            case 2008:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2008.csv");
                break;
            case 2009:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2009.csv");
                break;
            case 2010:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2010.csv");
                break;
            case 2011:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2011.csv");
                break;
            case 2012:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2012.csv");
                break;
            case 2013:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2013.csv");
                break;
            case 2014:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2014.csv");
                break;
            case 2015:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2015.csv");
                break;
            case 2016:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2016.csv");
                break;
            case 2017:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2017.csv");
                break;
            case 2018:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2018.csv");
                break;
            case 2019:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2019.csv");
                break;
            case 2020:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2020.csv");
                break;
            case 2021:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2021.csv");
                break;
            case 2022:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2022.csv");
                break;
            case 2023:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2023.csv");
                break;
            case 2024:
                url = new URL("https://raw.githubusercontent.com/abhionlyone/us-car-models-data/master/2024.csv");
                break;

        }
        Scanner scan = new Scanner(url.openStream());
        scan.useDelimiter(",");

        String carMake = "";



        scan.close();
        return new Car();
    }
}