package heranca;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome){
        super(nome);
    }



    public void imprime(){
        super.imprime();
        System.out.println(this.salario);

    }
    public void relatoriopagamento(){
        System.out.println("Eu "+this.nome+" recebi: "+this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
