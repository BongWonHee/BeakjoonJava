import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner taja = new Scanner(System.in);
       
        int a ;
        int b ; 
        int c ;
        

        a = taja.nextInt();
        b = taja.nextInt();
        c = taja.nextInt();

        System.out.println(a + b % c);
        System.out.println(a - b % c);

        // return 0;

    }
}
