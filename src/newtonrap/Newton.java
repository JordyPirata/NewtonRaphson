/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newtonrap;
import java.util.Scanner;

public class Newton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora del metodo Newton-Rapson");
        System.out.print("Ingrese f(c): ");
        String ecuacion = sc.nextLine();
        System.out.print("Ingrese el valor aproximado de x: ");
        double x0 = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese la tolerancia: ");
        double tolerancia = Double.parseDouble(sc.nextLine());
        double raiz = NewtonRapOp.encontrarRaiz(ecuacion, tolerancia, x0);
        System.out.println("La solucion es: " + raiz);
        sc.close();
    }

    
}
