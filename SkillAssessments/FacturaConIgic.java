package SkillAssessments;

// Aplicar el IGIC al importe

public class FacturaConIgic extends Factura{

    private static final double IGIC = 1.07;
    private Factura f = null;

    @Override
    public double applyImpuesto() {

        double value = f.getImporte() * IGIC;
        return value;

    }
    
}
