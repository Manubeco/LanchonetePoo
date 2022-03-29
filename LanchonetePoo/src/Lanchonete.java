import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lanchonete {

    private String Nome = "Confraria da coxinha";
    private int nLoja = 1;
    private String endereco = "Rua Senador Pompeu, 152";

    public String getNome() {
        return Nome;
    }

    protected void setNome(String nome) {
        Nome = nome;
    }

    public int getnLoja() {
        return nLoja;
    }

    protected void setnLoja(int nLoja) {
        this.nLoja = nLoja;
    }

    public String getEndereco() {
        return endereco;
    }

    protected void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
