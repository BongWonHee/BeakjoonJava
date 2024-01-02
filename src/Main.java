import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int[] box = new int[n] ;
      int c = 0, d = 0;
         // int k = scanner.nextInt();
     for (int b = 0; b < box.length; b++) {
      box[b]=b+1;
     }  
     for (int a = 1; a <= m; a++) {
         int i = scanner.nextInt();
         int j = scanner.nextInt();
         int ii = i - 1;
         int jj = j - 1;
         c = box[ii];
         d = box[jj];
         box[ii] = d;
         box[jj] = c;
   }

   for(int num : box){
      System.out.print(num + " ");
   }
   scanner.close();
}
 
}
