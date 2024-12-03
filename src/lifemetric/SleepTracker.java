/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lifemetric;

/**
 *SleepTracker.java
 *@author Murilo Carlos Batiuk
 * November 21st 2024 
 */
public class SleepTracker {
    
    //declaring variables
    protected int age;
    protected String name;

    //constructors
    public SleepTracker() {
    }

    public SleepTracker(int age) {
        this.age = age;
    }

    public SleepTracker(String name) {
        this.name = name;
    }
       
    //set method
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    //get method
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
    //details
    public String details(){
       return "Name: " + name + ", age: " + age;
   }
           
}
