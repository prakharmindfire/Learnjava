
import java.util.HashMap;

public class Hashmapdemo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        HashMap m= new HashMap();
        //HashMap<Integer, String> m= new HashMap<Integer, String>();

        m.put(101,"David");
        m.put(102,"Peter");
        m.put(103,"Smith");
        m.put(104,"Pat ");
        m.put(105,"Mitchell"); 

        System.out.println(m);  //{101=David, 102=Peter, 103=Smith, 104=Pat , 105=Mitchell}

        System.out.println(m.get(105));  //Mitchell

        m.remove(105);
        System.out.println(m);  //{101=David, 102=Peter, 103=Smith, 104=Pat }

        System.out.println(m.containsKey(101));   //true
        System.out.println(m.containsKey(106));   //false

        System.out.println(m.containsValue("Smith"));   //true
        System.out.println(m.containsValue("Josh hazlewood"));  //false

        System.out.println(m.isEmpty());  //false
        System.out.println(m.keySet());    //[101, 102, 103, 104]
        System.out.println(m.values());    //[David, Peter, Smith, Pat ]

        System.out.println(m.entrySet());   //[101=David, 102=Peter, 103=Smith, 104=Pat ]

        for(Object i: m.keySet()){
            System.out.println(i);
        }
        for(Object i: m.values()){
            System.out.println(i);
        }

        for(Object i: m.keySet()){
            System.out.println(i+"   "+m.get(i));
        }


        //Entry methods

        /*for(Map.Entry entry:m.entrySet()){
              //101 x
              System.out.println(entry.getKey()+ "    "+ entry.getValue());
        }*/

    }
}
