import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int subject[]=new int[size];

        // int[] subject=new int[3];
        // subject[0]=45;
        // subject[1]=54;
        // subject[2]=52;

       for (int i = 0; i <size ; i++) {
        subject[i]=sc.nextInt();
       }
       for (int i = 0; i < size; i++) {
        
       
        System.out.println(subject[i]);
        
       }
    }
    
}
