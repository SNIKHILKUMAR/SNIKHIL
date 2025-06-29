public class prime {
    public static void main(String[] args) {
        int n=1000000007;
        int item=0;
        boolean prime =true;
        for (int i = 2; i <n; i++) {
            if(n%i==0) {
                prime=false;
                break;


            }
        }

            if(prime==true) {
                System.out.print(n + " is prime");
            }
            else {
                System.out.print(n + "is not prime");
            }
        
    }
    
}
