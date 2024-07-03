public class reversestring {
    public static void main(String[] args) {
        String str="Prakhar";
        String revstr="";
        char ch;

        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            revstr=ch+revstr;
        }

        System.out.println("String is "+str);
        System.out.println("Reverse string is "+revstr);
    }
}
