package com.mycompany.constantesyvariables;

public class CalculadoraGeometrica implements FigurasGeometricas{
    private double longitudTriangulo;
    private double longitudCuadrado;
    private double radioCirculo;

    public CalculadoraGeometrica(double longitudTriangulo, double longitudCuadrado, double radioCirculo) {
        this.longitudTriangulo = longitudTriangulo;
        this.longitudCuadrado = longitudCuadrado;
        this.radioCirculo = radioCirculo;
    }

    @Override
    public double PerimetroTriangulo() {
        return LADOS_TRIANGULO*longitudTriangulo;
    }

    @Override
    public double PerimetroCuadrado() {
        return LADOS_CUADRADO*longitudCuadrado;
    }

    @Override
    public double AreaCirculo() {
        return 2*PI*radioCirculo;
    }


    
}
