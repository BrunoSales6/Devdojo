package lambdas;

import parametizando.dominio.Car;

public interface Predicate {
    boolean teste(Car car); // define o comportamento das lambdas: vai retornar um booleano, esperando um tipo Car.
    // Pra usar lambda você precisa de uma interface funcional. Pra que ela seja é necessário quw se tenha apenas um método abstrato na interfacer.( sem corpo)
    //(parametro)->(expressão)
}
