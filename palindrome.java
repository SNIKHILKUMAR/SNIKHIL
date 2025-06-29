import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int s=0,r,n,c;
        System.out.print("enter any number");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        c=n;

        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;

        }
        if(c==s)
           System.out.println("palindrome");
        else {
            System.out.println("not palindrome");
        }
        
    }
    
}
