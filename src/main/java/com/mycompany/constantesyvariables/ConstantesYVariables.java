package com.mycompany.constantesyvariables;

public class ConstantesYVariables {

    public static void main(String[] args) {
        CalculadoraGeometrica objetoCalculadora1 = new CalculadoraGeometrica(5, 3, 5);
        CalculadoraGeometrica objetoCalculadora2 = new CalculadoraGeometrica(3, 8, 7);
        System.out.println("Perimetro de un triangulo: "+ objetoCalculadora1.PerimetroTriangulo());
        System.out.println("Primetro de un cuadrado: "+ objetoCalculadora1.PerimetroCuadrado());
        System.out.println("Area de un circulo: " + objetoCalculadora1.AreaCirculo());
        
        System.out.println("Perimetro de un triangulo: "+ objetoCalculadora2.PerimetroTriangulo());
        System.out.println("Primetro de un cuadrado: "+ objetoCalculadora2.PerimetroCuadrado());
        System.out.println("Area de un circulo: " + objetoCalculadora2.AreaCirculo());
    }
}
