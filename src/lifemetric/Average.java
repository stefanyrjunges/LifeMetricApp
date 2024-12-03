/*
* Average.java
* @author: Stefany Rachor Junges
* 09/11/2024
*/

package lifemetric;

import java.util.ArrayList;

public class Average{

    private double totalWater, weekAverage;
    private ArrayList<Double> dailyWaterIntake;
    private String averageResult;
    
    public Average(ArrayList<Double> dailyWaterIntake) {
        this.dailyWaterIntake = dailyWaterIntake;
    }
    
    public void setDailyWaterIntake(ArrayList<Double> dailyWaterIntake) {
        this.dailyWaterIntake = dailyWaterIntake;
    }
   
    public double weekAverage(){
        totalWater = 0;
        for (int i = 0; i < dailyWaterIntake.size(); i++){
            totalWater += dailyWaterIntake.get(i);
        }
        weekAverage = totalWater / dailyWaterIntake.size();   
        return weekAverage;
    }
    
    public double monthIntakeProjection() {
        weekAverage();
        return totalWater * 4;
    }

    public double yearIntakeProjection() {
        weekAverage();
        return totalWater * 52;
    }
    
    public String averageFeedback(){
        averageResult = "Your weekly average water intake is " + weekAverage() +
                " liters. If you keep this average, your monthly water intake will be " + monthIntakeProjection() +
                " liters and your yearly water intake will be " + yearIntakeProjection() + " liters!";
        return averageResult;
    }   
}