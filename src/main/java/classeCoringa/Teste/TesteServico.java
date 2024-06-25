package classeCoringa.Teste;

import classeCoringa.dominio.Carro;
import classeCoringa.servico.RentalService;

import java.util.ArrayList;
import java.util.List;


public class TesteServico {
        public static void main(String[] args) {
                List<Carro> carroList=new ArrayList<>(List.of(new Carro("BMW"),new Carro("Ferrari")));
                RentalService<Carro> rentalService= new RentalService<>(carroList);
                Carro carro= rentalService.buscarObjetoDisponivel();

                rentalService.retornarObjetoAlugado(carro);

        }

}
