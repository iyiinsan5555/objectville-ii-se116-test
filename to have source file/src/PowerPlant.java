public class PowerPlant extends UtilityProvider{
    private int totalElectric;

    public PowerPlant(int row, int column){
        super(row, column);
        this.totalElectric = super.getCapacity();
    }

    public int getTotalElectric() {
        return totalElectric;
    }

    // IDK what this is for
    public void setTotalElectric(int totalElectric) {
        this.totalElectric = totalElectric;
    }

    // When the tick advance Simulation Runner can call this
    public void incTotalElectric() {
        totalElectric += 100;
    }

    // When the resource is Consumed Simulation Runner can call this
    public void decTotalElectric(int amount) {
        totalElectric -= amount;
    }
}