import java.util.Scanner;
public class teamprature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the temprature");
        float cel=scan.nextFloat();
       // float fer= scan.nextFloat();

        float fer = ((cel * 9)/5) + 32;
        System.out.println("temp"+fer);
    }
    
}
