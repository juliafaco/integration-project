package julia.faco.model;


public enum Formato {
    RETANGULAR("Retangular", TipoProduto.BOLOS),
    REDONDO("Redondo", TipoProduto.BOLOS),
    CORAÇÃO("Coração", TipoProduto.BOLOS),
    VINTE_FATIAS("Vinte Fatias", TipoProduto.TORTAS),
    TRINTA_FATIAS("Trinta Fatias", TipoProduto.TORTAS);

    private final String nome;
    private final TipoProduto tipoProduto;

    Formato (String nome, TipoProduto tipoProduto){
        this.tipoProduto = tipoProduto;
        this.nome = nome;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public String getNome(){
        return nome;
    }
}

