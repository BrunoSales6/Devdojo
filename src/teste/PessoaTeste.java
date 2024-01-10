package teste;

import dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa person=new Pessoa();
        person.setNome("Bruno");
        person.setIdade(19);
//        person.imprime();
        System.out.print(person.getNome()+"\n");
        System.out.print(person.getIdade());

    }


}
