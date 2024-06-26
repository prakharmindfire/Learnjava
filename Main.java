abstract class Abstraction {
    public abstract void Animalcry();

    public void cry() {
        System.out.println("Dog is crying");
    }
}

class Dog extends Abstraction {
    public void Animalcry() {
        System.out.println("Dog is an Animal");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.Animalcry();
        mydog.cry();
    }
}
