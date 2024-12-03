/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lifemetric;

/**
 *
 * @author Felipe Paneque sNumber 23156635
 */
public class CalorieTrackerUser {
        private String name,surname,gender,biotype,exercise;
        private int age;
        private double height, weight;
        
        //constructor
        public CalorieTrackerUser(String name, String surname,String gender, String biotype, String exercise, int age, double height, double weight) {
            this.name = name;
            this.surname = surname;
            this.gender = gender;
            this.biotype = biotype;
            this.exercise = exercise;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }
        
        public CalorieTrackerUser(){
        }

        //getter
        public String getName() {
            return name;
        }
        public String getSurname() {
            return surname;
        }
        public String getGender() {
            return gender;
        }
        public String getBiotype() {
            return biotype;
        }
        public String getExercise() {
            return exercise;
        }
        public int getAge() {
            return age;
        }
        public double getHeight() {
            return height;
        }
        public double getWeight() {
            return weight;
        }
        
        //setter
        public void setName(String name) {
            this.name = name;
        }    
        public void setSurname(String surname) {
            this.surname = surname;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        public void setBiotype(String biotype) {
            this.biotype = biotype;
        }
        public void setExercise(String exercise) {
            this.exercise = exercise;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        public void setWeight(double weight) {
            this.weight = weight;
        }

    
    public String userDetail() {
        return "\nName: " + name + "\nSurname: " + surname + "\nGender: " + gender  + "\nBiotype: " + biotype + "\nExercise: " + exercise + "\nage=" + age + "\nheight= " + height + "\nWeight: " + weight;
    }
        
        

}
