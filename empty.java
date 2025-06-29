

import java.util.Scanner;
public class empty {
   public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   System.out.print("enter first number:");
   int a=sc.nextInt();
   System.out.print("enter 2 number: ");
   int b=sc.nextInt();
   int c;

   c=a;
   a=b;
   b=c;
   System.out.println("the swap numbers are");

  
   System.out.println("then value of a is :"+a);
   System.out.println("then value of b is :"+b);

   }
}
