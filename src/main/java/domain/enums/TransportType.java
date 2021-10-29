package domain.enums;

public enum TransportType {
    BUS("Автобус"),
    TRAM("Трамвай"),
    ELECTRO_BUS("Электробус");

    private String name;

    TransportType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
