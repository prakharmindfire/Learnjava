public class javaexception {
    public static void main(String[] args) {
        try{
            int x=100/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Rest will continue");
    }
}
