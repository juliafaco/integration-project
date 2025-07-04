package julia.faco.model;


public enum Format {
    RETANGULAR("Retangular", ProductType.BOLOS),
    REDONDO("Redondo", ProductType.BOLOS),
    CORAÇÃO("Coração", ProductType.BOLOS),
    VINTE_FATIAS("Vinte Fatias", ProductType.TORTAS),
    TRINTA_FATIAS("Trinta Fatias", ProductType.TORTAS);

    private final String name;
    private final ProductType productType;

    Format(String name, ProductType productType){
        this.productType = productType;
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public String getName(){
        return name;
    }
}

