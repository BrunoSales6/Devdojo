package polimorfismo.servico;

import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calculoImpostoProduto(Produto produto){
        produto.calcularImposto();
        double imposto= produto.calcularImposto();
        System.out.println("RELATÓRIO DE IMPOSTO DO PRODUTO");
        System.out.println("PRODUTO: "+ produto.getNome());
        System.out.println("VALOR: "+ produto.getValor());
        System.out.println("VALOR DO IMPOSTO: "+ imposto);
        if(produto instanceof Tomate){
            Tomate tomate=(Tomate) produto;
            String data= tomate.getDataDeValidade();
            System.out.println("Data de validade: "+data);

        }
    }
}
