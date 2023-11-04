import java.util.Scanner; // Import the Scanner class

public class hello {
    public static int somme  (int a, int b) {
        return a+b;     }
    public static void affiche(int x) {
        System.out.println(x); 
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Entrez le premier nombre");
        int a = sc.nextInt(); 

        System.out.println("Entrez le deuxième nombre");
        int b = sc.nextInt(); 
        sc.close();
        
        int x = somme(a,b); 
        affiche(x);

    }
}
