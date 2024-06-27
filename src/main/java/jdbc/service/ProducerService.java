package jdbc.service;

import jdbc.dominio.Producer;
import jdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    private static void checkId(Integer id){
        if(id==null || id<=0){
            throw new IllegalArgumentException("Invald value for id");
        }
    }
    public static void save(Producer producer){
        ProducerRepository.save(producer);
    }

    public static void delete(Integer id){
        checkId(id);
        ProducerRepository.delete(id);
    }
    public static void update(Producer producer){
        checkId(producer.getId());
        ProducerRepository.update(producer);
    }
    public static List<Producer>findAll(){
        return ProducerRepository.findAll();
    }
    public static List<Producer>findByName(String nome){
        return ProducerRepository.findByName(nome);
    }
}
