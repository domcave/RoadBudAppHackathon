package com.example.hackathonproj;
import java.io.*;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.util.*;
import java.net.*;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    String[] years = {"1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003",
    "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
    "2018", "2019", "2020", "2021", "2022", "2023", "2024"};
    String[] makes = {"Acura", "Audi", "BMW", "Buick", "Cadillac", "Chevrolet", "Chrysler",
            "Dodge", "Ferrari", "Ford", "GMC", "Honda", "Hyundai", "Jeep", "Lexus", "Lincoln",
    "Mazda", "Mercedes-Benz", "Mitsubishi", "Nissan", "Pontiac",
            "Subaru", "Toyota", "Volkswagen", "Volvo"};
    String[] models = {};
    String[] oilTypes = {"Conventional", "Synthetic Blend", "Full Synthetic", "Monograde"};
    String[] tireTypes = {"Touring", "Performance", "All-Terrain", "Winter/Snow", "Track/Competition", "Other"};
    AutoCompleteTextView autoCompleteTextView1;
    ArrayAdapter<String> adapterItems1;
    AutoCompleteTextView autoCompleteTextView2;
    ArrayAdapter<String> adapterItems2;
    AutoCompleteTextView autoCompleteTextView3;
    ArrayAdapter<String> adapterItems3;
    AutoCompleteTextView autoCompleteTextView4;
    ArrayAdapter<String> adapterItems4;
    AutoCompleteTextView autoCompleteTextView5;
    ArrayAdapter<String> adapterItems5;
    private Button modelsButton;
    String[] make = {"None"};
    int[] year = {1991};
    String[] model = {};
    Car userCar = new Car();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView1 = findViewById(R.id.auto_complete_txt1);
        adapterItems1 = new ArrayAdapter<String>(this, R.layout.list_years, years);
        autoCompleteTextView1.setAdapter(adapterItems1);


        autoCompleteTextView2 = findViewById(R.id.auto_complete_txt2);
        adapterItems2 = new ArrayAdapter<String>(this, R.layout.list_years, makes);
        autoCompleteTextView2.setAdapter(adapterItems2);



            autoCompleteTextView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String item = adapterView.getItemAtPosition(i).toString();
                    userCar.setYear(Integer.parseInt(item));

                }
            });

            autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String item = adapterView.getItemAtPosition(i).toString();
                    userCar.setMake(item);


                }
            });

        autoCompleteTextView3 = findViewById(R.id.auto_complete_txt3);
        adapterItems3 = new ArrayAdapter<String>(this, R.layout.list_years, models);
        autoCompleteTextView3.setAdapter(adapterItems3);
        autoCompleteTextView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                userCar.setModel(item);

            }
        });








    }

    //this method handles getting matching car models
    public void getModels(View view) throws IOException{




        ArrayList<String> carModels = new ArrayList<String>();
        int carYear = userCar.getYear();
        InputStream carFile = getResources().openRawResource(R.raw.a1992);

        switch(carYear){
            case 1992:
                carFile = getResources().openRawResource(R.raw.a1992);
                break;
            case 1993:
                carFile = getResources().openRawResource(R.raw.a1993);
                break;
            case 1994:
                carFile = getResources().openRawResource(R.raw.a1994);
                break;
            case 1995:
                carFile = getResources().openRawResource(R.raw.a1995);
                break;
            case 1996:
                carFile = getResources().openRawResource(R.raw.a1996);
                break;
            case 1997:
                carFile = getResources().openRawResource(R.raw.a1997);
                break;
            case 1998:
                carFile = getResources().openRawResource(R.raw.a1998);
                break;
            case 1999:
                carFile = getResources().openRawResource(R.raw.a1999);
                break;
            case 2000:
                carFile = getResources().openRawResource(R.raw.a2000);
                break;
            case 2001:
                carFile = getResources().openRawResource(R.raw.a2001);
                break;
            case 2002:
                carFile = getResources().openRawResource(R.raw.a2002);
                break;
            case 2003:
                carFile = getResources().openRawResource(R.raw.a2003);
                break;
            case 2004:
                carFile = getResources().openRawResource(R.raw.a2004);
                break;
            case 2005:
                carFile =getResources().openRawResource(R.raw.a2005);
                break;
            case 2006:
                carFile = getResources().openRawResource(R.raw.a2006);
                break;
            case 2007:
                carFile = getResources().openRawResource(R.raw.a2007);
                break;
            case 2008:
                carFile = getResources().openRawResource(R.raw.a2008);
                break;
            case 2009:
                carFile = getResources().openRawResource(R.raw.a2009);
                break;
            case 2010:
                carFile = getResources().openRawResource(R.raw.a2010);
                break;
            case 2011:
                carFile = getResources().openRawResource(R.raw.a2011);
                break;
            case 2012:
                carFile = getResources().openRawResource(R.raw.a2012);
                break;
            case 2013:
                carFile = getResources().openRawResource(R.raw.a2013);
                break;
            case 2014:
                carFile = getResources().openRawResource(R.raw.a2014);
                break;
            case 2015:
                carFile = getResources().openRawResource(R.raw.a2015);
                break;
            case 2016:
                carFile = getResources().openRawResource(R.raw.a2016);
                break;
            case 2017:
                carFile = getResources().openRawResource(R.raw.a2017);
                break;
            case 2018:
                carFile = getResources().openRawResource(R.raw.a2018);
                break;
            case 2019:
                carFile = getResources().openRawResource(R.raw.a2019);
                break;
            case 2020:
                carFile = getResources().openRawResource(R.raw.a2020);
                break;
            case 2021:
                carFile = getResources().openRawResource(R.raw.a2021);
                break;
            case 2022:
                carFile = getResources().openRawResource(R.raw.a2022);
                break;
            case 2023:
                carFile = getResources().openRawResource(R.raw.a2023);
                break;
            case 2024:
                carFile = getResources().openRawResource(R.raw.a2024);
                break;

        }
        BufferedReader fileScan = new BufferedReader(
                new InputStreamReader(carFile, Charset.forName("UTF-8"))
        );

        String carMake = userCar.getMake();
        fileScan.readLine();

        Scanner lineScan = null;
        String line;
        line = fileScan.readLine();

        while((line = fileScan.readLine()) != null){

            lineScan = new Scanner(line);
            if(line.contains(carMake)){
                String[] tokens = line.split(",");
                carModels.add(tokens[2]);
            }
        }
        if(lineScan != null) {
            lineScan.close();
        }


        fileScan.close();
        String[] temp = new String[carModels.size()];
        temp = carModels.toArray(temp);
        models = temp;
        autoCompleteTextView3 = findViewById(R.id.auto_complete_txt3);
        adapterItems3 = new ArrayAdapter<String>(this, R.layout.list_years, models);
        autoCompleteTextView3.setAdapter(adapterItems3);
    }

    public void mainNext(View view){
        setContentView(R.layout.find_car2);
        autoCompleteTextView4 = findViewById(R.id.auto_complete_txt4);
        adapterItems4 = new ArrayAdapter<String>(this, R.layout.list_years, tireTypes);
        autoCompleteTextView4.setAdapter(adapterItems4);
        autoCompleteTextView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                userCar.setTires(item);
            }
        });
        autoCompleteTextView5 = findViewById(R.id.auto_complete_txt5);
        adapterItems5 = new ArrayAdapter<String>(this, R.layout.list_years, oilTypes);
        autoCompleteTextView5.setAdapter(adapterItems5);
        autoCompleteTextView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                userCar.setOil(item);
            }
        });
    }

}