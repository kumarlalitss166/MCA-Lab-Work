package week_6;

// Define first interface
interface Animal {
    void eat();
}

// Define second interface
interface Bird {
    void fly();
}

// Implementing multiple interfaces in a single class
class Bat implements Animal, Bird {
    @Override
    public void eat() {
        System.out.println("Bat eats insects.");
    }
    
    @Override
    public void fly() {
        System.out.println("Bat can fly.");
    }
}

// Main class to test multiple inheritance
public class w6p2{
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.eat();
        bat.fly();
    }
}
