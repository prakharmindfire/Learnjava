public class methodoverloading {
    void m1(int n1){
        System.out.println("Number1: "+ n1);
    }
    void m1(int n1,int n2){
        System.out.println("Number1: "+ n1 + " , Number2: "+n2);
    }

    public static void main(String[] args) {
        methodoverloading obj=new methodoverloading();
        obj.m1(5);
        obj.m1(4,6);
    }
}
