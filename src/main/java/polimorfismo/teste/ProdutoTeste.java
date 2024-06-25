package polimorfismo.teste;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;
import polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto computador=new Computador("Rayzen7000",5000);
        Tomate tomate= new Tomate("Tomate Siciliano",10);
        tomate.setDataDeValidade("22/02/2024");


        CalculadoraImposto.calculoImpostoProduto(computador);
        System.out.println("----------------");
        CalculadoraImposto.calculoImpostoProduto(tomate);

    }

}
