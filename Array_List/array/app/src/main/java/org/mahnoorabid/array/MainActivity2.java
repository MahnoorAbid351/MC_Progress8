package org.mahnoorabid.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView listView=findViewById(R.id.listView);
        String [] friendsArray = {"Mahnoor","Hira","Sara"};
        final ArrayList<String> friendsArrayList=new ArrayList<>(asList(friendsArray));
        //final ArrayList<String> friendsArrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,friendsArrayList);
       // listView.setAdapter(friendArrayAdapter);
    }
}