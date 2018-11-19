import java.util.ArrayList;
import java.util.List;

public class FlightManager {

    private Flight flight;
    private Plane plane;
    private PlaneType planetype;
    private Passenger passenger;
    private ArrayList<Passenger> manifest;


    public FlightManager() {
        this.flight = flight;
        this.plane = plane;
        this.planetype = planetype;
        this.passenger = passenger;
        this.manifest = new ArrayList<Passenger>();
    }

    public Flight getFlight() {
        return flight;
    }

    public Plane getPlane() {
        return plane;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public ArrayList<Passenger> getManifest() {
        return manifest;
    }


    public int getPassengerSpecifiedBagWeight(Plane plane) {
        return plane.getWeight() / plane.getCapacity();
    }


    public int getTotalBaggageWeight(Flight flight, Plane plane) {
        int totalBaggage = 0;
        System.out.println("manifest" + flight.getManifest());
        for (Passenger passenger : flight.getManifest()) {
            totalBaggage += passenger.getBags() * getPassengerSpecifiedBagWeight(plane);
        }
        return totalBaggage;
    }

    public int getAvailableBaggageWeightNumber(Plane plane){
        return plane.getWeight() / 2;
    }


    public int getRemainingBaggageWeight(Flight flight, Plane plane) {
        return getAvailableBaggageWeightNumber(plane) - getTotalBaggageWeight(flight, plane);
    }

    public int getPassengerBags(Passenger passenger, Plane plane) {
        return passenger.getBags() * getPassengerSpecifiedBagWeight(plane);
    }
}



