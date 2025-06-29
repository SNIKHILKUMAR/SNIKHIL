

class licence{
    public int person(int age) throws Exception{
    if(age>18){
    // System.out.println("eligiable for licence");
    return age;
    }

      else {
        // System.out.println("not eligiable for licence ");
    throw new Exception ();
    }

}
}
public class Dr_licence {
    public static void main(String[] args) {
        licence L=new licence();
        try {
            L.person(5);

        }
        catch (Exception e){
            System.out.println("not Eligiable for licence");
        }
    }

    
}
