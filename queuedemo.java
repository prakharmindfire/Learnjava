import java.util.PriorityQueue;

public class queuedemo{
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        PriorityQueue<String> q = new PriorityQueue<>();

        //Adding elements    
        q.add("A");
        q.add("B");
        q.add("C");
        q.offer("C");

        System.out.println(q);   //[A, B, C, C]

        System.out.println(q.element());  //A,   also peek()

        System.out.println(q.remove());  //A,   also poll()
        System.out.println(q);   //[B, C, C]

    }
}
