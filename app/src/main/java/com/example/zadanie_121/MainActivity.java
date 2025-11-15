package com.example.zadanie_121;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView countryRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Znajdź RecyclerView w layoucie
        countryRecyclerView = findViewById(R.id.countryRecylerView);

        // 2. Przygotuj źródło danych
        List<Country> countryArrayList = new ArrayList<>();
        countryArrayList.add(new Country("Polska", "Warszawa"));
        countryArrayList.add(new Country("Hiszpania", "Madryt"));
        countryArrayList.add(new Country("Francja", "Paryż"));
        countryArrayList.add(new Country("Włochy", "Rzym"));
        countryArrayList.add(new Country("Niemcy", "Berlin"));
        countryArrayList.add(new Country("Brazylia", "Brasília"));
        countryArrayList.add(new Country("Watykan", "Watykan"));
        countryArrayList.add(new Country("`Ukraina`", "Kijów"));
        countryArrayList.add(new Country("Rosja", "Moskwa"));
        countryArrayList.add(new Country("Wielka Brytania", "Londyn"));

        // 3. Stwórz Adapter i przekaż mu dane
        CountryAdapter adapter = new CountryAdapter(countryArrayList);

        // 4. Ustaw Adapter i LayoutManager dla RecyclerView
        countryRecyclerView.setAdapter(adapter);
        countryRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
