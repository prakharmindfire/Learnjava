
import java.util.Hashtable;

public class Hashtabledemo {
    public static void main(String[] args) {
        //Hashtable t= new Hashtable();  //capacity=11, load fcator= 0.75

       // Hashtable t= new(inital capacity); create hashtable object with some capacity
       //Hashtable t= new Hashtable(initial capacity, fill ratio/load factor);  

        Hashtable <Integer,String> t= new Hashtable<Integer,String>();

        t.put(101,"David");
        t.put(102,"Peter");
        t.put(103,"Smith");
        t.put(104,"Josh");
        //t.put(null,"Pat");  //NullPointerException
        //t.put(105,null);  //NullPointerException


        System.out.println(t);   //{104=Josh, 103=Smith, 102=Peter, 101=David}
        System.out.println(t.get(103));  //

        t.remove(104);
        System.out.println(t);   //{103=Smith, 102=Peter, 101=David}

        System.out.println(t.containsKey(102));  //true

        System.out.println(t.containsValue("Smith"));  //true
 
    }
}
