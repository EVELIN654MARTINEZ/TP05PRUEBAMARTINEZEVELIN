package punto2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int numero = Scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par: " + numero);
        } else {
            System.out.println("El número ingresado es impar: " + (numero * 2));
        }
    }
}


