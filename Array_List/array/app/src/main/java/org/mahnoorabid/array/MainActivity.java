package org.mahnoorabid.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=findViewById(R.id.myListView);
        final ArrayList<String> friendArrayList =new ArrayList<String>();
        friendArrayList.add("Mahnoor");
        friendArrayList.add("Hira");
        friendArrayList.add("Sara");
        friendArrayList.add("Fizza");
        friendArrayList.add("Komal");
        friendArrayList.add("Zara");
        friendArrayList.add("Ayesha");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,friendArrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("You clicked the name of",friendArrayList.get(position));
            }
        });
    }
}