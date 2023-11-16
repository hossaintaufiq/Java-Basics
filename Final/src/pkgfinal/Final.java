package pkgfinal;

public class Final {

    public static void main(String[] args) {

        try {
            int x = 10;
            int y = 0;
            double result = x / y;
            System.out.println("Result : " + result);
        }catch(Exception e){
            System.out.println("The exception is : "+ e );
        }
        finally{
            System.out.println("Last line of the code ....");
        }

        
    }

}
