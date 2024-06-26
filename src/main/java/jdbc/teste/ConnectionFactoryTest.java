package jdbc.teste;

import jdbc.conn.ConnectionFactory;
import jdbc.dominio.Producer;
import jdbc.repository.ProducerRepository;
import jdbc.service.ProducerService;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder()
                .name("MADHOUSE").id(1).build();

        ProducerService.update(producer1);


    }
}
