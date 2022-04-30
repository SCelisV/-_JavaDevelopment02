package SkillAssessments;

/*

Problema de patrones
Con este ejercicio se quiere comprobar la capacidad del candidato/a a la programación orientada a objetos aplicando alguno de los patrones de diseño conocidos, en este caso el patrón Factoría.

A continuación se plantea un ejercicio simple donde el objetivo es conseguir generar una factura donde se aplique el impuesto correspondiente en función de si es una factura para las islas Canarias o para la península.

*/


public abstract class Factura { // clase base para crear la jerarquía

    private int id;
    private double importe;

    public abstract double applyImpuesto(); // tenga que ser implementado para cada tipo de Factura

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getImporte(){
        return importe;
    }

    public void setImporte(double importe){
        this.importe = importe;
    }
}
