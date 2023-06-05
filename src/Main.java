import java.util.Scanner;
import java.util.Arrays;

public class Main {

   // 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든
   // 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

   // 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다

   public static <DataTimeFormatter> void main(String[] args) {

      Scanner taja = new Scanner(System.in);

      int add = taja.nextInt(); // 수열 크기 입력
      int[] num = new int[add];

      for (int i = 0; i < num.length; i++) {
         num[i] = taja.nextInt();
      }
      Arrays.sort(num); // 수열의 작은것에서 큰것으로 나열한다.

      System.out.print(num[0] + " " + num[add - 1]);
   }

}
