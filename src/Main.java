import java.util.Scanner;

public class Main {
    public static <DataTimeFormatter> void main(String[] args) {

        Scanner taja = new Scanner(System.in);

        int h, m, s;
        
        h = taja.nextInt();
        m = taja.nextInt();
        s = taja.nextInt();

       int min = h * 60 + m;
       min += s;

       int hour = (min/60)%24;

       int mint = min%60;

        System.out.println(hour + " " + mint);

    }
}
