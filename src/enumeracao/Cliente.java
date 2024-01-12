package enumeracao;

public class Cliente {



    private TipoPagamento tipoPagamento;
    private String nome;
    private TipoCliente tipoCliente;

    public Cliente(TipoPagamento tipoPagamento, String nome, TipoCliente tipoCliente) {
        this.tipoPagamento = tipoPagamento;
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "tipoPagamento=" + tipoPagamento +
                ", nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.NOME +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
