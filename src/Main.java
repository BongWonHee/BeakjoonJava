import java.util.Scanner;
import java.util.Arrays;

public class Main {

<<<<<<< HEAD
   // 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든
   // 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

   // 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다

   public static <DataTimeFormatter> void main(String[] args) {

      Scanner taja = new Scanner(System.in);

      int add = taja.nextInt(); // 수열 크기 입력
      int[] num = new int[add];

      for (int i = 0; i < num.length; i++) {
=======
   public static void main(String[] args) {

      Scanner taja = new Scanner(System.in);

      int[] num = new int[9];

      for (int i = 0; i < 9; i++) {
>>>>>>> 93974d43de42bb19ca9e7c5541549019ade2cefc
         num[i] = taja.nextInt();
      }
<<<<<<< HEAD
      Arrays.sort(num); // 수열의 작은것에서 큰것으로 나열한다.

      System.out.print(num[0] + " " + num[add - 1]);
=======

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
>>>>>>> 93974d43de42bb19ca9e7c5541549019ade2cefc
   }

}
