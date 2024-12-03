/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifemetric;

/**
 *
 * @author Felipe Paneque sNumber 23156635
 */
public class BmiCalculator{
    private double bmi, weight, height;
    private String output;
    //constructor
    public BmiCalculator() {
    }  
    

    //getter
    public double getBmi() {
        return bmi;
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
    public String getOutput(){
        return output;
    }
    
    //setter
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setHeight(double height) {
        this.height = height / 100; //convert cm to meter
    }

    public void calcBmi(){
        bmi = weight / (height * height);
        // Round to 2 decimal places
        bmi = Math.round(bmi * 100.0) / 100.0;
        
        if(bmi < 18.5){
            output = "You are Underweight";
        } else if(bmi >= 18.5 && bmi <= 24.9){
            output = "You are at a normal weight";
        } else if(25.0 >= bmi && bmi <= 29.9){
            output = "you are Overweight";
        } else if(bmi >= 30.0 && bmi <= 39.9){
            output = "you are obese";
        } else if(bmi > 40){
            output = "Severe obesity";
        }   
    }
    
}
