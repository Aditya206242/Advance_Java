/**
 * EncapsulationExample.java
 * 
 * This class demonstrates the concept of encapsulation in Java.
 * 
 * Encapsulation is a fundamental concept in object-oriented programming.
 * It restricts direct access to some of an object's components and 
 * can prevent the accidental modification of data.
 * 
 * In this example, we create a class with private variables and 
 * public methods to access and update those variables.
 */
public class EncapsulationExample {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        EncapsulationExample example = new EncapsulationExample();
        example.setName("Aditya");
        example.setAge(24);
        System.out.println("Name: " + example.getName());
        System.out.println("Age: " + example.getAge());
    }
}
