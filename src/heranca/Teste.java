package heranca;

public class Teste {
    public static void main(String[] args) {
        Endereco endereco=new Endereco();
        endereco.setCep("63034025");
        endereco.setRua("Rua dos reis");
        Pessoa p1=new Pessoa();
        p1.setCpf("69295737350");
        p1.setNome("João");
        p1.setEndereco(endereco);
        p1.imprime();

        System.out.println("---------------");

        Funcionario f1=new Funcionario();
        f1.setCpf("63034025");
        f1.setEndereco(endereco);
        f1.setNome("João");
        f1.setSalario(4000);
        f1.imprime();

    }



}
