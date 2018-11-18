import java.util.ArrayList;
import java.util.List;

public class FlightManager {

    private Flight flight;
    private Plane plane;
    private Passenger passenger;
    private ArrayList<Passenger> manifest;


    public FlightManager(Flight flight, Passenger passenger) {
        this.flight = flight;
        this.plane = plane;
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


    public int getPassengerSpecifiedBagWeight() {
        return PlaneType.BOEING747.getWeight() / PlaneType.BOEING747.getCapacity();
    }


    public int getTotalBaggageWeight() {
        int totalBaggage = 0;
        System.out.println("manifest" + flight.getManifest());
        for (Passenger passenger : flight.getManifest()) {
            totalBaggage += passenger.getBags() * getPassengerSpecifiedBagWeight();
        }
        return totalBaggage;
    }

    public int getAvailableBaggeWeightNumber(){
        return PlaneType.BOEING747.getWeight() / 2;
    }


    public int getRemainingBaggageWeight() {
        return getAvailableBaggeWeightNumber() - getTotalBaggageWeight();
    }

    public int getPassengerBags(Passenger passenger1) {
        return passenger.getBags() * getPassengerSpecifiedBagWeight();
    }
}



