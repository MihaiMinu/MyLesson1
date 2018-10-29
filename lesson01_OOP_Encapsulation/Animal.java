package lesson01_OOP_Encapsulation;

public class Animal {
        private String name;
        private double averageWeight;
        private int numberOfLegs;

        //Getter methods
        public String getName(){
            return name;
        }
        public double getAvergeWeight(){
            return averageWeight;
        }
        public int getNumberOfLegs(){
            return numberOfLegs;
        }
        //Setter methodes
        public void setName(String name){
            this.name = name;
        }
        public void setAverageWeight(double averageWeight){
            this.averageWeight = averageWeight;
        }
        public void setNumeberOfLegs(int numberOfLegs){
            this.numberOfLegs = numberOfLegs;
        }
}
