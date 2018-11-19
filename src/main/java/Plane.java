public class Plane {

    private PlaneType planetype;

    public Plane( PlaneType planetype) {
        this.planetype = planetype;
    }


    public PlaneType getPlanetype() {
        return planetype;
    }

    public int getCapacity() {
        return this.planetype.getCapacity();
    }

    public int getWeight() {
        return this.planetype.getWeight();
    }
}
