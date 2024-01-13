package Abstrato;

import Abstrato.teste.Rh;

public class Teste {
    public static void main(String[] args) {
        Gerente funcionario2=new Gerente("Nami",5000);
        Rh rh=new Rh("Usop",3000);
        Desenvolvedor desenvolvedor=new Desenvolvedor("Robin",80000);
        System.out.println(funcionario2);
        System.out.println(rh);
        System.out.println(desenvolvedor);

    }
}
