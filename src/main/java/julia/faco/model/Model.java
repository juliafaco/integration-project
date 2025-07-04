package julia.faco.model;

public enum Model {
    FELPUDO("Felpudo", Format.RETANGULAR),
    VINTAGE("Vintage", Format.RETANGULAR),
    CLASSICO("Clássico", Format.RETANGULAR),
    CHANTININHO("Chantininho", Format.REDONDO),
    PASTA_AMERICANA("Pasta americana", Format.REDONDO),
    VINTAGE2("Vintage", Format.REDONDO),
    ROMANTICO("Romântico", Format.CORAÇÃO),
    MINIMALISTA("Mininalista", Format.CORAÇÃO),
    CHOCOLATE("Chocolate", Format.VINTE_FATIAS),
    MORANGO("Morango", Format.VINTE_FATIAS),
    LIMAO("Limão", Format.VINTE_FATIAS),
    CHOCOLATE2("Chocolate", Format.TRINTA_FATIAS),
    MARACUJÁ("Maracujá", Format.TRINTA_FATIAS),
    FRUTAS_VERMELHAS("Frutas Vermelhas", Format.TRINTA_FATIAS);

    private final Format format;
    private final String name;

    Model(String name, Format format){
        this.format = format;
        this.name = name;
    }

    public Format getFormat() {
        return format;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

}
