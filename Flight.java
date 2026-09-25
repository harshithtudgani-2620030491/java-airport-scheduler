import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents a single flight record on the board.
 */
public class Flight implements Serializable, Comparable<Flight> {

    private static final long serialVersionUID = 1L;
    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    private String flightNumber;
    private String airline;
    private String source;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String gate;
    private FlightStatus status;

    public Flight(String flightNumber, String airline, String source, String destination,
                  LocalDateTime departureTime, LocalDateTime arrivalTime, String gate) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.gate = gate;
        this.status = FlightStatus.SCHEDULED;
    }

    // ---- Getters / Setters ----
    public String getFlightNumber() { return flightNumber; }

    public String getAirline() { return airline; }
    public void setAirline(String airline) { this.airline = airline; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public LocalDateTime getDepartureTime() { return departureTime; }
    public void setDepartureTime(LocalDateTime departureTime) { this.departureTime = departureTime; }

    public LocalDateTime getArrivalTime() { return arrivalTime; }
    public void setArrivalTime(LocalDateTime arrivalTime) { this.arrivalTime = arrivalTime; }

    public String getGate() { return gate; }
    public void setGate(String gate) { this.gate = gate; }

    public FlightStatus getStatus() { return status; }
    public void setStatus(FlightStatus status) { this.status = status; }

    /** Sort flights by departure time (used by PriorityQueue / Collections.sort). */
    @Override
    public int compareTo(Flight other) {
        return this.departureTime.compareTo(other.departureTime);
    }

    /** Row for the flight board table. */
    public String toRow() {
        return String.format("%-8s %-12s %-10s %-12s %-16s %-16s %-6s %-10s",
                flightNumber, airline, source, destination,
                departureTime.format(FMT), arrivalTime.format(FMT),
                gate, status);
    }

    public static String header() {
        return String.format("%-8s %-12s %-10s %-12s %-16s %-16s %-6s %-10s",
                "Flight", "Airline", "From", "To", "Departure", "Arrival", "Gate", "Status");
    }

    @Override
    public String toString() {
        return toRow();
    }
}
