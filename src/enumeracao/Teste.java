package enumeracao;

public class Teste {
    public static void main(String[] args) {
        Cliente c1=new Cliente(TipoPagamento.CREDITO,"Jiraya",TipoCliente.PESSOA_JURIDICA);
        Cliente c4=new Cliente(TipoPagamento.DEBITO,"Goku",TipoCliente.PESSOA_FISICA);
        System.out.println(c1);
        System.out.println(c4);
        System.out.println(TipoPagamento.CREDITO.calculaDesconto(100));


    }
}
