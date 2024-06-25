package desingPatterns.teste;

import desingPatterns.dominio.Aircraft;

public class Aircraft01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

    }

    private static void bookSeat(String seat){

        Aircraft aeroporto = new Aircraft();
        System.out.println(aeroporto.bookSeat(seat));

    }
}
