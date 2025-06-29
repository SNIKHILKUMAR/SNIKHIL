//import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
      // Scanner s= new Scanner(System.in);
       int n=1234, rev=0;
       System.out.println("enter the reverse no.");
       //n=s.nextInt();
       while(n!=0)
       {
        rev=(rev*10)+n%10;
        n=n/10;

       }
       System.out.println("reverse" + " "+rev);
    
    }
}
        