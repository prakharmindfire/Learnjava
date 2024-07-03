class Person{
    void message1(){
        System.out.println("He is a person");
    }
}
class Student extends Person{
    void message2(){
        System.out.println("He is a student");
    }
  void display(){
    message2();
    super.message1();
}
}
public class superkeyword {
    public static void main(String[] args) {
        Student s=new Student();
        s.display();
    }
}
