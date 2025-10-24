package Vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Van", 2020, 15.1);
        Truck truck = new Truck("masda", "F-150", 2019, 2.5);
        
        car.displayDetails();
        truck.displayDetails();
    }
}
