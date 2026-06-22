
package enums;

public enum DimensionEnum {
    SMALL(1),
    MEDIUM(2),
    LARGE(3);

    private final int id;

    // Constructor
    DimensionEnum(int id) {
        this.id = id;
    }

    // Getter para obtener el ID que va a la base de datos
    public int getId() {
        return id;
    }
}