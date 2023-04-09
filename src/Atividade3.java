import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        int a,b;

        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("digite o primeiro numero");
        a = teclado.nextInt();
        
        
        System.out.println("digite o segundo numero:");
        b = teclado.nextInt();
        teclado.close();
         int primeironumero;

         primeironumero = a + b;
         
         System.out.println(primeironumero);
    
    }
}