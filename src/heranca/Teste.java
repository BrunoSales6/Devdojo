package heranca;

public class Teste {
    public static void main(String[] args) {
        Endereco endereco=new Endereco();
        endereco.setCep("63034025");
        endereco.setRua("Rua dos reis");
        Pessoa p1=new Pessoa("João");
        p1.setCpf("69295737350");
        p1.setEndereco(endereco);
        p1.imprime();

        System.out.println("---------------");

        Funcionario f1=new Funcionario("João");
        f1.setCpf("63034025");
        f1.setEndereco(endereco);
        f1.setSalario(4000);
        f1.imprime();
        f1.relatoriopagamento();

    }



}
