package desingPatterns.teste;

import desingPatterns.dominio.Pessoa;

public class BuilderPatternTeste01 {
    public static void main(String[] args) {
        Pessoa build = new Pessoa.PessoaBuilder()
                .nome("Bruno")
                .sobrenome("Sales")
                .email("aaaaaaa")
                .username("ffff")
                .build();

        System.out.println(build);


    }
}
