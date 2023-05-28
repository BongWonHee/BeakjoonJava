import java.util.Scanner;

public class Main {
    public static <DataTimeFormatter> void main(String[] args) {

        Scanner taja = new Scanner(System.in);

        int a, b, c;
        
        a = taja.nextInt();
        b = taja.nextInt();
        c = taja.nextInt();

     if(a == b && b == c){

        System.out.println( 10000 + (a * 1000) );
     }else if ( a == b ){
        System.out.println(1000 + (a * 100));
     }else if ( b == c){
        System.out.println(1000 + ( b * 100));
     }else if ( c == a){
        System.out.println( 1000 + (c * 100));
     }   
     else{
        int maxiem = Math.max(a, Math.max(b,c));
        System.out.println(maxiem*100);
    
     }
    

    }
}
