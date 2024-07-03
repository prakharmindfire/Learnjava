public class Palindrome {
    static int palindrome(int n,int rev){
        if(n<10){
            return rev*10+n;
        }
        else{
            int ldigit=n%10;
            rev=rev*10+ldigit;
            return palindrome(n/10, rev);
        }
    }

    public static void main(String[] args) {
        int n=1234;
        int rev=palindrome(n, 0);
        if(n==rev){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindome");
        }
    }
}
