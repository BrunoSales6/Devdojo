package enumeracao;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pesssoa física"),
    PESSOA_JURIDICA(2,"Pessoa Jurídica");


    public final int VALOR;
    public final String NOME;
    TipoCliente(int valor, String nome){
        this.VALOR=valor;
        this.NOME=nome;
    }


}
