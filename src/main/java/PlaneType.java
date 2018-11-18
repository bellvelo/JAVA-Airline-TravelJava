public enum PlaneType {

    BOEING747(100, 1000),
    DC10(200, 2000),
    ZEPPLIN(300, 3000);

    private final int capacity; // final = constant value.
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}


