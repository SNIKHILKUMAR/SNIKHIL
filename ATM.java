import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        int amount = sc.nextInt();
        
        System.out.println(" Welcome to ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        int n = sc.nextInt();
        while (true){
        switch(n)  {
            case(1):
             System.out.println("Your Amount is : " +amount);
            break;

            case(2):
            System.out.println("Enter your deposit amount");
            int deposit = sc.nextInt();
            amount =amount + deposit;
            break;

            case(3):
            System.out.println("Enter your withdraw amount");
            int withdraw = sc.nextInt();
            amount = amount - withdraw;
            break;        }
        sc.close();
        }
    }
}