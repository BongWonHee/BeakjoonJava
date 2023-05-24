import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;

public class Main {
    public static void main(String[] args) {

        Scanner taja = new Scanner(System.in);

        int a, b;
        a = taja.nextInt();
        b = taja.nextInt();

        if (a > b) {
            System.out.println(">");

        } 
        if (a < b)
        {
            System.out.println("<");
        }
        if (a == b)
            
        {
            System.out.println("==");
        }

        // return 0;

    }
}
