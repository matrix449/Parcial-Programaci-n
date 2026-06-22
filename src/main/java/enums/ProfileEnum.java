
package enums;

public enum ProfileEnum {
    
    user_root(1),
    propietario(2),
    emprendedor(3),
    colaborator(4),
    invitado(5);

    // Variable interna para guardar el número
    private final int codigo;

    // Constructor del enum
    ProfileEnum(int codigo) {
        this.codigo = codigo;
    }

    // El método GET para obtener el código
    public int getCodigo() {
        return codigo;
    }
}
