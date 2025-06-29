public class userGreet {
    static void greetUser(int n){
        if( n==0)
        return;

        

        System.out.println("hello user"+n);
        greetUser (n-1);

    }
    public static void main(String[] args) {
        int n=10;
      greetUser(n);

        
    }
    
}
