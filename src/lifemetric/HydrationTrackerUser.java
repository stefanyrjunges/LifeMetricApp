/*
* HydrationTrackerUser.java
* @author: Stefany Rachor Junges
* 09/11/2024
*/

package lifemetric;

public class HydrationTrackerUser {
    protected int age;
    protected double weight;
    protected String exerciseLevel, climateType, name;

    public HydrationTrackerUser(String name, int age, double weight, String exerciseLevel, String climateType) {
        this.age = age;
        this.weight = weight;
        this.exerciseLevel = exerciseLevel;
        this.climateType = climateType;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setExerciseLevel(String exerciseLevel) {
        this.exerciseLevel = exerciseLevel;
    }

    public void setClimateType(String climateType) {
        this.climateType = climateType;
    }
    
    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getExerciseLevel() {
        return exerciseLevel;
    }

    public String getClimateType() {
        return climateType;
    }

    public String getName(){
        return name;
    }
    
    public String feedback(){
        String userResult = "Analysis for " + name + ": considering your age of " + age + " years, your weight of " + weight + "kg, your " + exerciseLevel + " level of exercise and a " + climateType + " climate"; 
        return userResult;
    }
}
