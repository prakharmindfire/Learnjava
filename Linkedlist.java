
import java.util.LinkedList;

public class Linkedlist {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //LinkedList <Integer> l=new LinkedList<Integer>();

        LinkedList l=new LinkedList();

        l.add(200);
        l.add('A');
        l.add("Welcome");
        l.add(11.5);
        l.add(true);

        System.out.println(l);    //[200, A, Welcome, 11.5, true]

        System.out.println(l.size());  //5

        l.remove(1);
        System.out.println(l);   //[200, Welcome, 11.5, true]

        l.add(2,"Java");
        System.out.println(l);

        System.out.println(l.get(1));

        l.set(1,"Python");
        System.out.println(l);

        System.out.println(l.contains("Python"));
        System.out.println(l.contains("C++"));

        System.out.println(l.isEmpty());

        


    }
}