package pkg5;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mencari Faktor Suatu Bilangan");
        long k = 0;
        
        
        while(k == 0){
        System.out.print("a = ");
        
        long n = 1, f, g, h, a;
        
        a = input.nextLong();
        g = (long) Math.ceil(a / 2);
        h = g + 1;
        
        System.out.print("Faktor dari a = {1");
        while (n <= h ){
            n = n + 1;
            f = a % n;
            if (f == 0){
                System.out.print(", " + n);
            }
        }
        System.out.print(", " + a + "}");
        System.out.println(" ");
        }
        
    }
    
}
