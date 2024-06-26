
class Inheritance {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Inheritance {
    void eat() {
        System.out.println("Barking...");
    }

    void display() {
        eat();
        super.eat();
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
