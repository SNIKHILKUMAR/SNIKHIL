import java.util.Scanner;

public class simpleinterest {
    static float Simpleinterest(float p,float r,float t){
        float SI = (p*r*t)/100;
        return SI;

    }
    public static void main(String[] args) {
        Scanner sc = sc.new Scanner(System.in);
        System.out.println("Enter a principle");
        float a = sc.nextInt();
        System.out.println("Enter a amount");
        float p = sc.nextInt();
        System.out.println("Enter a amount");
        float r = sc.nextInt();
        System.out.println("enter the time");
        float t = sc.nextInt();
        float res = Simpleinterest(p,r,t);
        System.out.println("Your value is :"+res);
        sc.close();

    }
}
