public class Salgados {
    private String nome;
    private String recheio = "tradicional";
    private double preco;
    private int quantidade;

    public Salgados(String nome, String recheio, double preco, int quantidade) {
        this.nome = nome;
        this.recheio = recheio;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Salgados(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Salgados(String recheio, double preco) {
        this.recheio = recheio;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
