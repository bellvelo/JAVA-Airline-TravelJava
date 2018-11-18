public class Plane {

    private PlaneType planetype;

    public Plane( PlaneType planetype) {
        this.planetype = planetype;
    }

//    public Plane( String planeModel, int capacity, int weight) {
//        this.planeModel = planeModel;
//        this.capacity = capacity;
//        this.weight = weight;
//    }

    public PlaneType getPlanetype() {
        return planetype;
    }


//    public String getPlaneModel() {
//        return planeModel;
//    }
//
//    public int getCapacity() {
//        return capacity;
//    }
//
//    public int getWeight() {
//        return weight;
//    }
}
