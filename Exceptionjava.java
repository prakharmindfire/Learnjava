import java.util.Scanner;
class youngerAgeException extends RuntimeException{
    youngerAgeException(String msg){
        super(msg);
    }
}

public class Exceptionjava{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=s.nextInt();
        if(age<18){
            throw new youngerAgeException("You are not eligible for voting");
        }
        else{
            System.out.println("Eligible for voting");
        }
    }
}
