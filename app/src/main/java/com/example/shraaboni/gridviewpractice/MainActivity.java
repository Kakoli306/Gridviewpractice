package com.example.shraaboni.gridviewpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.shraaboni.gridviewpractice.adapter.GridAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    GridLayoutManager layoutManager;

    private String item1[]={"Temperature","Humidity","Pressure","Cloud","Date"};
    private String item2[]={"Temperature1","Humidity1","Pressure1","Cloud1","Date1"};
    private String item3[]={"Temperature2","Humidity2","Pressure2","Cloud2","Date2"};
    private String item4[]={"Temperature3","Humidity3","Pressure3","Cloud3","Date3"};
    private String item5[]={"Temperature4","Humidity4","Pressure4","Cloud4","Date4"};
    private int image[]={R.drawable.logo,
            R.drawable.images
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        layoutManager = new GridLayoutManager(MainActivity.this,3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        GridAdapter adapter = new GridAdapter(MainActivity.this,image,item1,item2,item3,item4,item5);
        recyclerView.setAdapter(adapter);
    }
}
