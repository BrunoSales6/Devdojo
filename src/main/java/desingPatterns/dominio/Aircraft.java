package desingPatterns.dominio;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {
    private final Set<String> availableSeats= new HashSet<>();
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
        availableSeats.add("1C");
        availableSeats.add("1D");
    }


    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
