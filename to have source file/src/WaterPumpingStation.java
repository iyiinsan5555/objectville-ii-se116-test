public class WaterPumpingStation extends UtilityProvider {
    private int TotalWater;

    public WaterPumpingStation(int row, int column){
        super(row, column);
        this.TotalWater = super.getCapacity();
    }

    public int getTotalWater() {
        return TotalWater;
    }

    // IDK what this is for
    public void setTotalWater(int totalWater) {
        TotalWater = totalWater;
    }

    // When the tick advance Simulation Runner can call this
    public void incTotalWater() {
        TotalWater += 100;
    }

    // When the resource is Consumed Simulation Runner can call this
    public void decTotalWater(int amount) {
        TotalWater -= amount;
    }

}
