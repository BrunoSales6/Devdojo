package modificadorfinal;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro=new Carro();
        System.out.println(carro.VELOCIDADE_LIMITE);
        Comprador c2=new Comprador();
        carro.COMPRADOR.setNome("Mestre Kame");
        System.out.println(carro.COMPRADOR);
    }


}
