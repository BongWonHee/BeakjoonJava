import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      Scanner taja = new Scanner(System.in);

      int a, b;

      while (taja.hasNextInt()) {

         a = taja.nextInt();
         b = taja.nextInt();

         System.out.println(a + b);

      }
      taja.close();
   }

}
