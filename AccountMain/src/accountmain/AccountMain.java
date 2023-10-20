
package accountmain;

public class AccountMain {

    public static void main(String[] args) {
      Account a1 = new Account(2253336, 2254.23);
      
        System.out.println(a1.toString());
        
        
        a1.credit(500);
        System.out.println(a1.toString());
        
                a1.debit(700);
        System.out.println(a1.toString());
    }
    
}
