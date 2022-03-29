public class Cliente {

    String nome;
    String aniversario;
    String contato;

    public Cliente(String nome, String aniversario, String contato) {
        this.nome = nome;
        this.aniversario = aniversario;
        this.contato = contato;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente " + nome + '\n' +
                "aniversario = " + aniversario + '\n' +
                "contato= " + contato;
    }

    public static void main (String[] args) {
    Cliente conta = new Cliente("Lucas","12/05/1990","(85 9 8935-1254)");
        System.out.println(conta);

    boolean clienteEspecial;
        if (conta.nome == "Lucas"){
            System.out.println("Pode caprichar no recheio!");
            }
        else {System.out.println("Pedido normal");
            }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}

