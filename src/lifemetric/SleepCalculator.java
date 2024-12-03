/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifemetric;

import java.util.ArrayList;

/**
 * SleepCalculator.java
 * @author Murilo Carlos Batiuk
 * November 21st 2024
 */
public class SleepCalculator extends SleepTracker {

    // array for the days of the week and return message
    private ArrayList<Integer> dailySleep;
    private String message;

    // constructor
    public SleepCalculator(int age) {
        super(age);
    }
    
    public SleepCalculator(String name) {
        super(name);
    }
    
    SleepCalculator() {

    }
   
    //set method
    public void setDailySleep(ArrayList<Integer> dailySleep) {
        this.dailySleep = dailySleep;
    }
    
    public void setMessage(String message){
        this.message = message;
    }

    // compute method
    //get the sum of the seven fields and divide by the length of the array (total / 7) to calculate the average sleep of the user
    public double calculateAverageSleep() {
        int sum = 0;
        for (int i = 0; i < dailySleep.size(); i++) {
            sum += dailySleep.get(i);
        }
        double avgSleep = sum / dailySleep.size();
        return avgSleep;
    }
    
    // if else statements for the calculation of average sleep hours 
    public String compare() {        
        double sleep = calculateAverageSleep();
        
        //Toddlers (1–2 years): 11–14 hours
        if (age >= 1 && age <= 2){
            if ((sleep >= 11) && (sleep <= 14)) {
                return message = "Congratulations, " + name + ". According to your age, you're sleeping enough hours.";
            } else if (sleep < 11) {
                return message = "That's bad, " + name + ". You're not sleeping enough hours. \nAccording to your age, you should be sleeping between 8 and 10 hours per night.";
            } else if (sleep > 14) {
                return message = "Hey, " + name + ". You're a sleepy head. You're sleeping more than enough. \nAccording to your age, you should be sleeping between 8 and 10 hours per night.";
            }
        } 
        
        //Preschoolers (3–5 years): 10–13 hours
        if (age >= 3 && age <= 5){
            if ((sleep >= 10) && (sleep <= 13)) {
                return message = "Congratulations, " + name + ". According to your age, you're sleeping enough hours.";
            } else if (sleep < 10) {
                return message = "That's bad. You're not sleeping enough hours. \nAccording to your age, you should be sleeping between 8 and 10 hours per night.";
            } else if (sleep > 13) {
                return message = "Hey, " + name + ". You're a sleepy head. You're sleeping more than enough. \nAccording to your age, you should be sleeping between 8 and 10 hours per night.";
            }
        }
        
        //School-age children (6–13 years): 9–11 hours
        if (age >= 6 && age <= 13){
            if ((sleep >= 9) && (sleep <= 11)) {
                return message = "Congratulations, " + name + ". According to your age, you're sleeping enough hours.";
            } else if (sleep < 9) {
                return message = "That's bad, " + name + ". You're not sleeping enough hours. \nAccording to your age, you should be sleeping between 8 and 10 hours per night.";
            } else if (sleep > 11) {
                return message = "Hey, " + name + ". You're a sleepy head. You're sleeping more than enough. \nAccording to your age, you should be sleeping between 8 and 10 hours per night.";
            }
        }

        //Teenagers (14–17 years): 8–10 hours
        if (age >= 14 && age <= 17){
            if ((sleep >= 8) && (sleep <= 10)) {
                return message = "Congratulations, " + name + ". According to your age, you're sleeping enough hours.";
            } else if (sleep < 8) {
                return message = "That's bad, " + name + ". You're not sleeping enough hours. \nAccording to your age, you should be sleeping between 8 and 10 hours per night.";
            } else if (sleep > 10) {
                return message = "Hey, " + name + ". You're a sleepy head. You're sleeping more than enough. \nAccording to your age, you should be sleeping between 8 and 10 hours per night.";
            }
        } 
        
        //Young adults (18–25 years): 7–9 hours
        //Adults (26–64 years): 7–9 hours
        else if (age >= 18 && age <= 64){
            if((sleep >= 7) && (sleep <= 9)){
                return message = "Congratulations, " + name + ". According to your age, you're sleeping enough hours.";
            }else if (sleep < 7) {
                return message = "That's bad, " + name + ". You're not sleeping enough hours. \nAccording to your age, you should be sleeping between 8 and 10 hours per night.";
            } else if (sleep > 9) {
                return message = "Hey, " + name + ". You're a sleepy head. You're sleeping more than enough. \nAccording to your age, you should be sleeping between 8 and 10 hours per night.";
            }
        }
        
        //Older adults (65+ years): 7–8 hours
        else if (age >= 64){
            if((sleep >= 7) && (sleep <= 8)){
                return message = "Congratulations, " + name + ". According to your age, you're sleeping enough hours.";
            }else if (sleep < 7) {
                return message = "That's bad, " + name + ". You're not sleeping enough hours. \nAccording to your age, you should be sleeping between 8 and 10 hours per night.";
            } else if (sleep > 8) {
                return message = "Hey, " + name + ". You're a sleepy head. You're sleeping more than enough. \nAccording to your age, you should be sleeping between 8 and 10 hours per night.";
            }
        }
        return message;
    }

    //get method
    public String getMessage() {
        return message;
    }
    
    //override method
    @Override
    public String details(){
        String output = super.details();
        return output;
    }

}
