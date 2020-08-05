package com.papahades.workoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 TextView mtextview ;
 String workout;
 private workout_class exsersise = new workout_class();                  // creating object for workout_class
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextview=findViewById(R.id.text_view_2);

                      ////??????????????????????????????????????? setting adapter for the spinner///////////////?

        final Spinner mspinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.workOuts, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        mspinner.setAdapter(adapter);
 /////????????????????????????????????????????????????????????????????????????????????????????????????????????????????????//////////////////////




        mspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                workout=String.valueOf(mspinner.getSelectedItem());



                List<String> exsersice = exsersise.workOuts(workout);



               StringBuilder arrayBuilder =new StringBuilder(); // string builder for displaying workout



               for(String work : exsersice){
                   arrayBuilder.append(work).append('\n');         
               }

                mtextview.setText(arrayBuilder);             // seting textView




            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
}