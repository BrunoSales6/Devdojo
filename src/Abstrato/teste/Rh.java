package Abstrato.teste;

import Abstrato.Funcionario;

public class Rh extends Funcionario {
    public Rh(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario=this.salario+this.salario*0.1;
    }
}
