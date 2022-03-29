import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Scanner;

public class Empada extends Salgados {

    private String tipo;
    private String cobertura = "simples";
    private int estoque = 10;

    public Empada(String nome, String tipo, String cobertura, String recheio, double preco, int quantidade) {
        super(nome, recheio, preco, quantidade);
        this.tipo = tipo;
        this.cobertura = cobertura;
    }

    public Empada(String nome, String tipo, String recheio, double preco,int quantidade) {
        super(nome, recheio, preco, quantidade);
        this.tipo = tipo;
    }

    public Empada(String recheio, double preco, String tipo) {
        super(recheio, preco);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return getNome() + " " + tipo + " " + cobertura + " sabor " + getRecheio() + " " +
                " por " + "R$" + getPreco() + " " + getQuantidade() + " unidades";
    }

//    public static void main(String[] args) {
//        Empada empadaFrango = new Empada("Empada", "salgada", "frango", 8.00, 10);
//        Empada empadaCaprese = new Empada("Empada", "salgada", "aberta", "caprese", 10.00, 15);
//        Empada empadaBiscoito = new Empada("Biscoito de empada","salgado", 4.0, 15 );
//        Empada empadaChocolate = new Empada("Empada", "doce", "aberta", "chocolate", 12.00,7);
//        System.out.println(Arrays.asList(empadaFrango,"\n", empadaCaprese,"\n",empadaBiscoito,"\n", empadaChocolate));
//    }

    public static void main(String[] args) {
        Scanner Entradas = new Scanner(System.in);

        System.out.println("Escolha qual produto você deseja:"+
                "\n"+"Digite 1 para Empada"+
                "\n"+"Digite 2 para Biscoito");

        int escolheProduto = Entradas.nextInt();
        String produtoEscolhido = "";
        if(escolheProduto == 1){produtoEscolhido="Empada";}
        else if(escolheProduto == 2){produtoEscolhido="Biscoito";}
        else System.out.println("Recomece");


        System.out.println("Escolha qual empada você deseja:"+
                "\n"+"Digite 1 para Empada de queijo"+
                "\n"+"Digite 2 para empada calabresa"+
                "\n"+"Digite 3 para empada de misto"+
                "\n"+"Digite 4 para empada de frango"+
                "\n"+"Digite 5 para biscoito de empada");

        int escolheSabor = Entradas.nextInt();
        String saborEscolhido = "";
        if(escolheSabor == 1){saborEscolhido="de queijo";}
        else if(escolheSabor == 2){saborEscolhido="de calabresa";}
        else if (escolheSabor == 3){saborEscolhido="mista";}
        else if (escolheSabor == 4){saborEscolhido="de frango";}
        else if (escolheSabor == 5){saborEscolhido="de empada";}
        else System.out.println("Recomece");

        System.out.println("Escolha o tamanho da sua empada:"+
                "\n"+"Digite 1 para pequena"+
                "\n"+"Digite 2 para média"+
                "\n"+"Digite 3 para grande");

        int tamProduto = Entradas.nextInt();
        double valor=0;
        if(tamProduto == 1){valor=0.5;}
        else if(tamProduto == 2){valor=2;}
        else if (tamProduto == 3){valor=5;}
        else System.out.println("Recomece");
        double precoParcial=8+valor;

        System.out.println("Quantos produtos deseja:"+
                "\n"+"Digite o núemro");

        int qtdProduto = Entradas.nextInt();
        double quantidade = 0;
        quantidade = quantidade + qtdProduto;
        double precofinal= precoParcial*quantidade;

                Empada salgadoFinal = new Empada(produtoEscolhido, saborEscolhido,saborEscolhido, precofinal, (int) quantidade);
        System.out.println(salgadoFinal);
    }

    public void assar() {
        if (estoque < 10) {
            System.out.println("Está na hora de assar mais");
        } else {
            System.out.println("Estoque cheio");
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}


