public class Primenumer {
    static boolean primeno(int n){
        if(n<=1){
            return false;
        }
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if(primeno(14)){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
}
