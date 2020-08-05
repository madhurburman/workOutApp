package com.papahades.workoutapp;

import java.util.ArrayList;
import java.util.List;

public class workout_class


{
     List<String> workOuts (String workoutType)


     {
         List<String> workout =new ArrayList<>();

         if (workoutType.equals("chest")){
             workout.add("BENCH PRESS");

         }
         else if (workoutType.equals("Back")){
             workout.add("pullUps");
         }
         else if(workoutType.equals("Biceps")){
             workout.add("bicepsCurls");
         }
         else if (workoutType.equals("triceps")){
             workout.add("triceps extensions");
         }
         else if (workoutType.equals("shoulder")){
             workout.add("supermen punch");
         }
         else if (workoutType.equals("Legs")){
             workout.add("situps");
         }
         return workout;
     }
}
