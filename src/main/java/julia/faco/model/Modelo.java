package julia.faco.model;

public enum Modelo {
    FELPUDO("Felpudo", Formato.RETANGULAR),
    VINTAGE("Vintage", Formato.RETANGULAR),
    CLASSICO("Clássico", Formato.RETANGULAR),
    CHANTININHO("Chantininho", Formato.REDONDO),
    PASTA_AMERICANA("Pasta americana", Formato.REDONDO),
    VINTAGE2("Vintage", Formato.REDONDO),
    ROMANTICO("Romântico", Formato.CORAÇÃO),
    MINIMALISTA("Mininalista", Formato.CORAÇÃO),
    CHOCOLATE("Chocolate", Formato.VINTE_FATIAS),
    MORANGO("Morango", Formato.VINTE_FATIAS),
    LIMAO("Limão", Formato.VINTE_FATIAS),
    CHOCOLATE2("Chocolate", Formato.TRINTA_FATIAS),
    MARACUJÁ("Maracujá", Formato.TRINTA_FATIAS),
    FRUTAS_VERMELHAS("Frutas Vermelhas", Formato.TRINTA_FATIAS);

    private final Formato formato;
    private final String nome;

    Modelo (String nome, Formato formato){
        this.formato = formato;
        this.nome = nome;
    }

    public Formato getFormato() {
        return formato;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }

}
