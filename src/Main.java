import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      Scanner taja = new Scanner(System.in);

      int[] num = new int[9];

      for (int i = 0; i < 9; i++) {
         num[i] = taja.nextInt();

      }

      int max = num[0];
      int maxvalue = 0;
      for (int i = 1; i < 9; i++) {
         if (num[i] > max) {
            max = num[i]; // 첫번째 입력값과 다음 입력값을 비교여 큰수를 받는다.
            maxvalue = i; // 입력받은 값이 큰수가 나올때 수열 자리를 받는다.

         }

      }
      System.out.println(max);
      System.out.println(maxvalue + 1); // 0부터 시작을 하므로 1을 더해서 계산해준다.
   }

}
