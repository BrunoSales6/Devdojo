package desingPatterns.teste;

import desingPatterns.dominio.Aircraft;
import desingPatterns.dominio.AircraftSingletonEager;

public class AircraftSingleton01 {
    public static void main(String[] args) {
        AircraftSingleton01.bookSeat("1A");
        AircraftSingleton01.bookSeat("1A");

    }

    private static void bookSeat(String seat){
        AircraftSingletonEager aeroporto= AircraftSingletonEager.getInstancia();
        System.out.println(aeroporto.bookSeat(seat));




    }
}
