package com.gridnine.testing;
    import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Flight> flights =  FlightBuilder.createFlights();
        FlightFilterImpl flightFilter = new FlightFilterImpl();
        System.out.println("Все полеты:");
        flightFilter.allFlightSegments(flights);
        System.out.println("");

        System.out.println("Вылет до текущего момента времени:");
        flightFilter.departureToTheCurrentPointInTime(flights);

        System.out.println("Имеются сегменты с датой прилёта раньше даты вылета:");
        flightFilter.thereAreSegmentsWithAnArrivalDateEarlierThanTheDepartureDate(flights);

        System.out.println("Общее время, проведённое на земле превышает два часа:");
        flightFilter.theTotalTimeSpentOnTheGroundExceedsTwoHours(flights);
    }
}