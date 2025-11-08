package cultura;

public class Cultura {

    private int id;
    private String nome;
    private FaseCultura faseCrescimento;
    private double necessidadeHidrica;
    private double producaoEstimativa;

    public Cultura(int id, String nome, FaseCultura faseCrescimento, double necessidadeHidrica, double producaoEstimativa) {
        this.id = id;
        this.nome = nome;
        this.faseCrescimento = faseCrescimento;
        this.necessidadeHidrica = necessidadeHidrica;
        this.producaoEstimativa = producaoEstimativa;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public FaseCultura getFaseCrescimento() {
        return faseCrescimento;
    }

    public double getNecessidadeHidrica() {
        return necessidadeHidrica;
    }

    public double getProducaoEstimativa() {
        return producaoEstimativa;
    }

    public void atualizarFaseCrescimento(FaseCultura novaFase) {
        this.faseCrescimento = novaFase;
    }

    public double calcularProdutividade() {
        return producaoEstimativa;
    }

    @Override
    public String toString() {
        return "Cultura: " + nome +
                " | Fase: " + faseCrescimento;
    }
}