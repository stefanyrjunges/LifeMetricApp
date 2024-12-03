/*
* HydrationGoal.java
* @author: Stefany Rachor Junges
* 09/11/2024
*/


package lifemetric;

public class HydrationGoal extends HydrationTrackerUser{
    
    public HydrationGoal(String name, int age, double weight, String exerciseLevel, String climateType) {
        super(name, age, weight, exerciseLevel, climateType);
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.exerciseLevel = exerciseLevel;
        this.climateType = climateType;
    }
    
        public double adjustWeight(){
            if (getWeight() <= 50){
                return getWeight() * 0.03;
            } else if (getWeight() <= 70){
                return getWeight() * 0.033;
            } else {
                return getWeight() * 0.035;
            }
        }
        
        public double adjustExerciseLevel(){
            switch (getExerciseLevel().toLowerCase()){
                case "low":
                    return 0.2;
                case "moderate":
                    return 0.5;
                case "heavy":
                    return 1;
                default:
                    return 0;   
            }
        }
        
        public double adjustClimate(){
            switch (getClimateType().toLowerCase()){
                case "warm":
                    return 0.5;
                case "cold":
                    return 0.15;
                default:
                    return 0;   
            }
        }
    
        public double adjustAge(){
            if (age > 55){
               return 0.9;
            } else {
                return 1.0;
            }
        }
        
        public double goalIntake(){
            return (adjustWeight() + adjustExerciseLevel() + adjustClimate()) * adjustAge();
        }   
        
        @Override
        public String feedback(){
            String userResult = super.feedback();
            String goalResult = userResult + ", your water intake goal should be " + goalIntake() + " liter(s)!";
            return goalResult;
        }
}