/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifemetric;


/**
 *
 * @author Felipe Paneque sNumber 23156635
 */
public class BmrCalculator extends CalorieTrackerUser{
    private double bmr;
    private double calories;
    private double biotypeNumb;
    private String output;
    
    public BmrCalculator(double bmr, double calories, double biotypeNumb, String output, String name, String surname, String gender, String biotype, String exercise, int age, double height, double weight) {
        super(name, surname, gender, biotype, exercise, age, height, weight);
        this.bmr = bmr;
        this.calories = calories;
        this.biotypeNumb = biotypeNumb;
        this.output = output;
    }

    public BmrCalculator() {
        bmr = 0.0;
    }
    
    
    //getter
    public double getBmr(){
        return bmr;
    }
    public String getOutput(){
        return output;
    }
    public double getCalories(){
        return calories;
    }
    
    //setter
    public void setBmr(double bmr){
        this.bmr = bmr;
    }
    public void setCalories(double calories){
        this.calories = calories;
    }
    
    //set biotype
    public void calcBiotype(){
       if(getBiotype().equalsIgnoreCase("ectomorph")){
           biotypeNumb = 0.1;
       }  else if(getBiotype().equalsIgnoreCase("endomorph")){
           biotypeNumb = -0.1;
       } else if(getBiotype().equalsIgnoreCase("mesomorph")){
           biotypeNumb = 0.0;
       }
        System.out.println(biotypeNumb);
    }
    
    //bmr calculation
    public void calcBmr() {
        if (getGender().equalsIgnoreCase("male")) {
            bmr = 10 * getWeight() + 6.25 * getHeight() - 5 * getAge() + 5;
        } else {
            bmr = 10 * getWeight() + 6.25 * getHeight() - 5 * getAge() - 161;
        }
        bmr = bmr + biotypeNumb;
        System.out.println("BMR: " + bmr);
    }
    
    public void calcCalorie(){
        if(getExercise().equalsIgnoreCase("littleExercise")){
            calories = Math.round((bmr * 1.2) * 100) / 100;
        } else if (getExercise().equalsIgnoreCase("lightActive")){
            calories = Math.round((bmr * 1.375)*100)/ 100;
        } else if(getExercise().equalsIgnoreCase("moderate")){
            calories = Math.round((bmr * 1.155)*100)/ 100;
        } else if (getExercise().equalsIgnoreCase("veryActive")){
            calories = Math.round((bmr * 1.725)*100)/ 100;
        } else if(getExercise().equalsIgnoreCase("superActive")){
            calories = Math.round((bmr * 1.9)*100)/ 100;
        }
        output = "Your BMR is: " + bmr + " calories daily" + "\n and your daily activity level(TDEE) is: " + calories + " calories/day";
    }

    @Override
    public String userDetail() {
        return super.userDetail() + "\nBmr: "+ bmr + "\ncalories" + "\nTDEE:" + calories + "calories /day";
    }

    
    
}
