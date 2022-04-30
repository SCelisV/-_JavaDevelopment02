package SkillAssessments;

// Aplicar el IVA al importe

public class FacturaConIva extends Factura{

    private static final double IVA = 1.21;
    private Factura f = null;

    @Override
    public double applyImpuesto() {
        
        double value = f.getImporte() * IVA;
        return value;

    }

}
