import java.util.Scanner;
public class subject {
    public static void main(String[] args) {
        System.out.println("enter the subject");
        
        Scanner sc= new Scanner(System.in);
        System.out.println("math");
        System.out.println("chemistry");
        System.out.println("physics");

        float math= sc.nextFloat();
        float chemistry= sc.nextFloat();
        float physics= sc.nextFloat();

        float avg=(math+physics+chemistry)/3;

        System.out.println("average"+avg);


        


        
    }

    
}
