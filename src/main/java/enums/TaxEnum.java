
public enum TaxEnum {

    IVA_21(0.21); 

    private final double porcentaje;

    TaxEnum(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
}