import java.util.*;
public class palindrome_new {

    public static void  palindrome(String str ){
        for (int i = 0; i < str.length()/2; i++) {
            int  n =str.length();
            if (str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("its not palindrome");
                // return false;
                return;
            }
            else{
                System.out.println("its is  palindrome ");
            }
        }
        // return true;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        System.out.println(name);
        // String str= "racecar";

    //    System.out.println(palindrome(str));
    palindrome(name);
    }
    
}
