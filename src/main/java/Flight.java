import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> manifest;
    private Plane plane;
    private String flightNo;
    private String depAirport;
    private String arrAirport;
    private String depTime;
    private Passenger passenger;
    private FlightManager flightmanager;

    public Flight(String flightNo, String depAirport, String arrAirport, String depTime) {
        this.manifest = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.depAirport = depAirport;
        this.arrAirport = arrAirport;
        this.depTime = depTime;
        this.passenger = passenger;
        this.flightmanager = flightmanager;
    }

    public ArrayList<Passenger> getManifest() {
        return manifest;
    }

    public void setManifest(ArrayList<Passenger> manifest) {
        this.manifest = manifest;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public String getArrAirport() {
        return arrAirport;
    }

    public String getDepTime() {
        return depTime;
    }

    public int getPassengerCount() {
        return this.manifest.size();
    }

    public void bookSeat(Passenger passenger) {
        if (getPassengerCount() < PlaneType.BOEING747.getCapacity()){
            this.manifest.add(passenger);
        } else {
            this.manifest.size();
        }
    }

    public int getRemainingSeats(Plane plane) {
        return plane.getPlanetype().getCapacity() - getPassengerCount();
    }
}
