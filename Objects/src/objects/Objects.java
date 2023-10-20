
package objects;


import java.util.Scanner;
public class Objects {

    public static void main(String[] args) {
        
        Scanner n= new Scanner(System.in);
        
        int x =n.nextInt();
        int y= n.nextInt();
        Calculation C1= new Calculation();// Creating an object 
        // here new is a constructor to creat a Calculation object 
        
        // now calling the objects methods 
        
        int answer =C1.Calculation(x,y); // reciving the value in a int variable and then print the value 
//        1st we have to declare the object and then pass the values acording to the declared method

            System.out.println(answer);

        
        
        
    }
    
}
