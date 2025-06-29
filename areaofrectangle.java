import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length");	
        int n = sc.nextInt();
        System.out.println("Enter a Breath");
        int m = sc.nextInt();
        int c = n  * m;
        System.out.println("Area of rectangle is : "+c);
        sc.close();
    }
}