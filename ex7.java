//making a change
import java.util.Scanner;
public class ex7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Entrez un nombre");
        int a = sc.nextInt(); 
        sc.close();
        System.out.println("le double de " + a + " = " + 2*a );
    }
    
}
