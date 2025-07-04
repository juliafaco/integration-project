package julia.faco.model;

public enum ProductType {
    BOLOS("Bolos"),
    TORTAS("Tortas");

    private final String name;

    ProductType(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
