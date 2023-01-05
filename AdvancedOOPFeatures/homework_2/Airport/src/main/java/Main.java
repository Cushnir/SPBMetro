import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(@NotNull Airport airport) {
        return airport.getTerminals()
                .stream()
                .map(Terminal::getFlights)
                .flatMap(List::stream)
                .filter(flight -> flight.getType() == Flight.Type.DEPARTURE
                        && (flight.getDate()
                        .toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime())
                        .isAfter(LocalDateTime.now())
                        && (flight.getDate()
                        .toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime())
                        .isBefore(LocalDateTime.now().plusHours(2)))
                .collect(Collectors.toList());

        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
    }

}