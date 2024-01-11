package enumeracao;

public class Teste {
    public static void main(String[] args) {
        Cliente c1=new Cliente("Jiraya",TipoCliente.PESSOA_FISICA);
        Cliente c4=new Cliente("Kamen rider",TipoCliente.PESSOA_JURIDICA);
        System.out.println(c1);
        System.out.println(c4);


    }
}
