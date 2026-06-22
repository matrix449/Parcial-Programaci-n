
package enums;

public enum ZoneEnum {
    
    Norte(1),
    Sur(2),
    Este(3),
    Oeste(4),
    Centro(5);

    // Variable interna para guardar el número
    private final int codigo;

    // Constructor del enum
    ZoneEnum(int codigo) {
        this.codigo = codigo;
    }

    // El método GET para obtener el código
    public int getCodigo() {
        return codigo;
    }
}
