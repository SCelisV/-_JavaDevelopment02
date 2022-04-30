package SkillAssessments;

        // Crear una factura para peninsula y otra para canarias
        // Aplicar el impuesto y mostrarlo por pantalla

public class FacturaMain {

    public static void main (String args[]){

        // Factura para peninsula
        Factura facturaPeninsula = new FacturaConIva();
        facturaPeninsula.setImporte(100);

        // Factura para canarias 
        Factura facturaCanarias = new FacturaConIgic();
        facturaCanarias.setImporte(200);

        System.out.println("La factura de peninsula es: " + facturaPeninsula.applyImpuesto());
        System.out.println("La factura de Canarias es: " + facturaCanarias.applyImpuesto());

    }
    
}
