import java.util.Scanner;

public class Coxinha extends Salgados{

    private String catupiry;
    private String tamanho = "normal";
    private int estoque= 6;

    public Coxinha(String nome, String tamanho, String recheio, String catupiry, double preco, int quantidade) {
        super(nome, recheio, preco,quantidade);
        this.catupiry = catupiry;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return getNome() + " " + tamanho + " de " + getRecheio() + " " + catupiry +
                " catupiry " + " por " + "R$" + getPreco() ;
    }

    public Coxinha(String nome, String recheio, String catupiry, double preco,int quantidade) {
        super(nome, recheio, preco, quantidade);
        this.catupiry = catupiry;
    }

    public static void main(String[] args) {
        Scanner Entradas = new Scanner(System.in);

        System.out.println("Escolha qual salgado você deseja:"+
                "\n"+"Digite 1 para bolinha de queijo"+
                "\n"+"Digite 2 para bolinha de calabresa"+
                "\n"+"Digite 3 para bolinha mista"+
                "\n"+"Digite 4 para coxinha de frango"+
                "\n"+"Digite 5 para coxinha de frango com catupiry"+
                "\n"+"Digite 6 para coxinha de carne de sol");

        int escolheSabor = Entradas.nextInt();
        String SaborEscolhido = "";
        if(escolheSabor == 1){SaborEscolhido="de queijo";}
        else if(escolheSabor == 2){SaborEscolhido="de calabresa";}
        else if(escolheSabor == 3){SaborEscolhido="mista";}
        else if(escolheSabor == 4){SaborEscolhido="de frango";}
        else if(escolheSabor == 5){SaborEscolhido="de frango com catupiry";}
        else if (escolheSabor == 6){SaborEscolhido="de carne de sol";}
        else System.out.println("Recomece");

        System.out.println("Escolha quanto recheio deseja em sua coxinha:"+
                "\n"+"Digite 1 para pouco recheio"+
                "\n"+"Digite 2 para recheio normal"+
                "\n"+"Digite 3 para muito recheio");

        int tamRecheio = Entradas.nextInt();
        String tamanho="";
        double valor=0;
        if(tamRecheio == 1){valor=0.5;tamanho="pequeno";}
        else if(tamRecheio == 2){valor=2;tamanho="médio";}
        else if (tamRecheio == 3){valor=5;tamanho="grande";}
        else System.out.println("Recomece");
        double precoParcial=6+valor;

        System.out.println("Deseja seu salgado com Catupiry:"+
                "\n"+"Digite 1 para com Catupiry"+
                "\n"+"Digite 2 para sem Catupiry");

        int escCatupiry = Entradas.nextInt();
        String Catupiry = "";
        if(tamRecheio == 1){Catupiry="com";}
        else if(tamRecheio == 2){Catupiry="sem";}

        System.out.println("Quantos produtos deseja:"+
                "\n"+"Digite o núemro");

        int qtdProduto = Entradas.nextInt();
        double quantidade = 0;
        quantidade = quantidade + qtdProduto;
        double precofinal= precoParcial*quantidade;

        Coxinha salgadoFinal = new Coxinha("Salgado",tamanho,SaborEscolhido,"sem", precofinal, 15);
        System.out.println(salgadoFinal);
    }

    public void fritar() {
        if (estoque < 10) {
            System.out.println("Está na hora de fritar mais");}
        else {System.out.println("Estoque cheio");
        }
    }

    public String getCatupiry() {
        return catupiry;
    }

    public void setCatupiry(String catupiry) {
        this.catupiry = catupiry;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}

