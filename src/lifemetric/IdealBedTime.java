/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifemetric;

/**
 *IdealBedTime.java
 *@author Murilo Carlos Batiuk
 * November 21st 2024
 */
public class IdealBedTime extends SleepTracker {
    
    //variables
    private int wakeUpTime, bedTime;
    private String message;
    
    //constructors
    public IdealBedTime(int age) {
        super (age);
    }

    public IdealBedTime(String name){
        super(name);
    }
    
    public void setWakeUpTime(int wakeUpTime) {
        this.wakeUpTime = wakeUpTime;
    }
       
    // compute method   
    
    public String wakeUpAt(){
        
        //Toddlers (1–2 years) where 12 is the average hours of sleep
        if (age >= 1 && age <= 2){
            bedTime = wakeUpTime - 12;
            if (bedTime < 0) {
                //in order to make the the format for 24 hours, I added 24 so the result wouldn't be negative. 
                //For example, if a person needs to sleep 8 hours and needs to wake up at 6, the result would be - 2, by adding 24, the result is 22
                bedTime += 24; 
            }
                return message = name + ", according to your age, you should go to bed at " + bedTime + ":00";
        }
        
        //Preschoolers (3–5 years) where 11 is the average hours of sleep
        else if (age >= 3 && age <= 5){
            bedTime = wakeUpTime - 11;
            if (bedTime < 0) {
                bedTime += 24; 
            }
                return message = name + ", according to your age, you should go to bed at " + bedTime + ":00";
        }
        
        //School-age children (6–13 years) where 10 is the average hours of sleep
        else if (age >= 6 && age <= 13){
            bedTime = wakeUpTime - 10;
            if (bedTime < 0) {
                bedTime += 24; 
            }
                return message = name + ", according to your age, you should go to bed at " + bedTime + ":00";
        }
        
        //Teenagers (14–17 years) where 9 is the average hours of sleep
        else if (age >= 14 && age <= 17){
            bedTime = wakeUpTime - 9;
            if (bedTime < 0) {
                bedTime += 24; 
            }
                return message = name + ", according to your age, you should go to bed at " + bedTime + ":00";
        }
        
        //Young adults (18–25 years) and Adults (26–64 years) where 8 is the average hours of sleep
        else if (age >= 18 && age <= 64) {
            bedTime = wakeUpTime - 8;
            if (bedTime < 0) {
                bedTime += 24; 
            }
            return message = name + ", according to your age, you should go to bed at " + bedTime + ":00";
        }
        
        //Older adults (65+ years)where 7 is the average hours of sleep
        else if (age > 64){
            bedTime = wakeUpTime - 7;
            if (bedTime < 0) {
                bedTime += 24; 
            }
                return message = name + ", according to your age, you should go to bed at " + bedTime + ":00";
        }
       
        return message;
    }
        
    //get method
    public String getMessage() {
        return message;
    }
       
}
