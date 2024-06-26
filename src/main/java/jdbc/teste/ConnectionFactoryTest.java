package jdbc.teste;

import jdbc.conn.ConnectionFactory;
import jdbc.dominio.Producer;
import jdbc.repository.ProducerRepository;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder()
                .name("Fanta5").build();
        ProducerRepository.save(producer1);

    }
}
