package pkgfinal;

import java.util.Scanner;

public class Final {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner n = new Scanner(System.in);
                System.out.print("Enter num1: ");
                int num1 = n.nextInt();

                System.out.print("Enter num2: ");
                int num2 = n.nextInt();

                int result = num1 / num2;

                System.out.println("Result : " + num1 + "/" + num2 + " = " + result);
            } catch (Exception e) {
                System.out.println("Exception : " + e);
            }
        }

    }

}
