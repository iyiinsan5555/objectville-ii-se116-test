public class InternetHub extends UtilityProvider{
    private int totalInternet;

    public InternetHub(int row, int column){
        super(row, column);
        this.totalInternet = super.getCapacity();
    }

    public int getTotalInternet() {
        return totalInternet;
    }

    // IDK what this is for
    public void setTotalInternet(int totalInternet) {
        this.totalInternet = totalInternet;
    }

    // When the tick advance Simulation Runner can call this
    public void incTotalInternet() {
        totalInternet += 100;
    }

    // When the resource is Consumed Simulation Runner can call this
    public void decTotalInternet(int amount) {
        totalInternet -= amount;
    }

}
