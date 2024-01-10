package dominio;

public class Funcionary {
    public String nome;
    public int idade;
    public double[] salary;

    public void imprime(){
        int count=0;
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double v:salary){
            count+=1;
            System.out.printf("No mês %d o salário foi de %f \n",count,v);
        }
    }

    public void media(){
        double m=0;
        double soma=0;
        for(double num:salary){
            soma+=num;
        }
        m=soma/3;
        System.out.printf("A media é: %f",m);
    }

}


