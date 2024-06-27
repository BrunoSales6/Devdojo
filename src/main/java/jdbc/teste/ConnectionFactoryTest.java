package jdbc.teste;

import jdbc.conn.ConnectionFactory;
import jdbc.dominio.Producer;
import jdbc.repository.ProducerRepository;
import jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        List<Producer> all = ProducerService.findByName("Mad");
        log.info(all);


    }
}
