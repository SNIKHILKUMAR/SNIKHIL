import java.util.Scanner;
public class BMIcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the weight of the body");
        float w=sc.nextFloat();
        System.out.println("enter the height of the body");
        float h=sc.nextFloat();
        float BMI=w/(h*h);
        System.out.println("BMI:"+BMI);

        
         
    }
    
}
