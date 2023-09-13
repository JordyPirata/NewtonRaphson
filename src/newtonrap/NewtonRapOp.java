/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newtonrap;

/**
 *
 * @author Jordy
 */
public class NewtonRapOp {
    public static double evaluarFuncion(String funcion, double x) {
        double resultado = 0.0;
        String[] terminos = funcion.split("(?=[-+])");
        for (String termino : terminos) {
            if (termino.contains("x")) {
                String[] partes = termino.split("x");
                double coeficiente = 1.0;
                if (partes[0].equals("-")) {
                    coeficiente = -1.0;
                } else if (!partes[0].equals("+") && !partes[0].equals("")) {
                    coeficiente = Double.parseDouble(partes[0]);
                }
                int exponente = 1;
                if (partes.length > 1) {
                    exponente = Integer.parseInt(partes[1].substring(1));
                }
                resultado += coeficiente * Math.pow(x, exponente);
            } else {
                resultado += Double.parseDouble(termino);
            }
        }
        return resultado;
    }

    public static double evaluarDerivada(String funcion, double x) {
        double f1 = evaluarFuncion(funcion, x);
        double f2 = evaluarFuncion(funcion, x + 0.0001);
        double derivada = (f2 - f1) / 0.0001;
        return derivada;
    }

    public static double encontrarRaiz(String funcion, double tolerancia, double x0) {
        double x1 = x0;
        while (Math.abs(evaluarFuncion(funcion, x1)) > tolerancia) {
            x1 = x1 - evaluarFuncion(funcion, x1) / evaluarDerivada(funcion, x1);
        }
        return x1;
    }
}
