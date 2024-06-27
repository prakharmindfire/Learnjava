import java.util.*;

public class ArrayList1 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(100);
        arr.add("Collections");
        arr.add(30.2);
        arr.add('P');
        arr.add(true);

        System.out.println(arr); // [100, Collections, 30.2, P, true]

        System.out.println("Size on an ArrayList: " + arr.size()); // Size on an ArrayList: 5

        arr.remove(3); // arr.remove('P');
        System.out.println(arr); // [100, Collections, 30.2, true]

        arr.add(2,"Java");
        System.out.println(arr);   //[100, Collections, Java, 30.2, true]

        System.out.println(arr.get(2));  //Java

        arr.set(2,"Python");
        System.out.println(arr);   //[100, Collections, Python, 30.2, true]

        //searching
        System.out.println(arr.contains("Python"));    //true
        System.out.println(arr.contains("C++"));       //false

        System.out.println(arr.isEmpty());  //false


        /*for(int i=0;i<arr.size();i++){        // For loop
            System.out.println(arr.get(i));   //100
                                              //Collections
                                              //Python
                                              //30.2
                                              //true
        }*/

        /*for(Object e:arr){                  //For each loop
            System.out.println(e);          // same result as above
        }*/

        Iterator it=arr.iterator();          //same output
        while(it.hasNext()){
            System.out.println(it.next());   //printing the element and move to next
        }




    }
}
