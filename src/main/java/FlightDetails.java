public enum FlightDetails {

    FR675("GLA","CDG"),
    BA201("LHR", "GNA"),
    EZ333("MAN", "JFK");

    private final String depAirport;
    private final String arrAirport;

    FlightDetails(String depAirport, String arrAirport) {
        this.depAirport = depAirport;
        this.arrAirport = arrAirport;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public String getArrAirport() {
        return arrAirport;
    }
}
