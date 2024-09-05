package punto4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entre 1 y 9 para mostrar la tabla de multiplicar: ");
        int numero = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }
}
