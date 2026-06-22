package enums;

public enum StateEnum {
    
    Activo(1),
    Inactivo(2),
    Pendiente(3);

    // Variable para almacenar el número
    private final int codigo;

    // Constructor del enum
    StateEnum(int codigo) {
        this.codigo = codigo;
    }

    // El método GET para obtener el código
    public int getCodigo() {
        return codigo;
    }
}