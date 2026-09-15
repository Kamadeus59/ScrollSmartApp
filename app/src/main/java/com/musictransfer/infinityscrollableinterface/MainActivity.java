package com.musictransfer.infinityscrollableinterface;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        List<Citation> citationList = new ArrayList<Citation>();
        Citation c1 = new Citation("Je pense donc je suis", "Descartes");
        Citation c2 = new Citation("L'homme est un être fini", "Blaise Pascal");
        Citation c3 = new Citation("Test3", "Unknown");
        Citation c4 = new Citation("Ah", "unknown");
        Citation c5 = new Citation("Un petit pas pour l'homme un grand pas pour l'humanité", "Neil Armstrong");

        citationList.add(c1);
        citationList.add(c2);
        citationList.add(c3);
        citationList.add(c4);
        citationList.add(c5);

    }
}