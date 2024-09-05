package punto3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entre 0 y 10 para calcular su factorial: ");
        int numero = Scanner.nextInt();
        
        int factorial = 1;
        int i = 1;
        
        while (i <= numero) {
            factorial *= i;
            i++;
        }
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}

