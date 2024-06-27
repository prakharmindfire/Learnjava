class Animal{
    public void animalName(){
        System.out.println("Animals are good");
    }
}

class Dog extends Animal{
    public void animalName(){
        System.out.println("Dogs are good");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.animalName();   
    } 
}
