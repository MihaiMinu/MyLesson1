package lesson01_OOP_Encapsulation;

public class Lesson01_OOP_Encapsulation {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.setName("jucika");
        myAnimal.setAverageWeight(1.5);
        myAnimal.setNumeberOfLegs (2);

        System.out.println("Name: " + myAnimal.getName());
        System.out.println("Marimia: " + myAnimal.getAvergeWeight());
        System.out.println("Numarul de latrari: " + myAnimal.getNumberOfLegs());

    }
}
