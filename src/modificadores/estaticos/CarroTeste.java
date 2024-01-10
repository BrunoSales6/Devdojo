package modificadores.estaticos;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1= new Carro("Camaro",200);
        Carro c2= new Carro("Ferrari",270);
        Carro c3= new Carro("Porche",297);
        Carro.setVelocidadeLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
