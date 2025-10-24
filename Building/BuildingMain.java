
package Building;

public class BuildingMain {
    public static void main(String[] args) {
        ResidentialBuilding rb = new ResidentialBuilding(
                "5 avenue", 10, 5000.0, 40, 15000.0);

        CommercialBuilding cb = new CommercialBuilding(
                "diegosilang street", 15, 10000.0, 8000.0, 300.0);

        rb.displayInfo();
        cb.displayInfo();
    }
}
