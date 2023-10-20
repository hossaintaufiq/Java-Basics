
package accountmain;

public class Account {
    private int AccountNumber;
    private double balance = 0.0;
    
    public Account (int AccountNumber, double balance){
        this.AccountNumber=AccountNumber;
        this.balance=balance;
        
    }
    
    public Account(int AccountNumber){
        this.AccountNumber=AccountNumber;
    }
    public int getAccountNumber(){
        return AccountNumber;
    }
    public double getBalance(){
        return balance;
    }
    
    public void setBalance( double balance ){
        this.balance= balance;
    }
    
    public void credit (double ammount){
        balance= balance+ammount;
    }
    public void debit(double ammount){
        if(balance>=ammount){
            balance=balance-ammount;
        }
        else {
            System.out.println("ammount withdrawn exceeds the current balance!");
        }  
    }
    
    @Override
    public String toString(){
        return "A/C no: "+ getAccountNumber()+ " Balance = $"+ getBalance();
    }
}
