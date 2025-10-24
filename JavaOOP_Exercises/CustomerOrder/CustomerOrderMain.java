package CustomerOrder;

import java.time.LocalDate;
public class CustomerOrderMain {
    public static void main(String[] args) {
        OnlineOrder order1 = new OnlineOrder(
                "order 12",
                "Elger",
                LocalDate.now(),
                "Davao",
                "TRK12345678"
        );

        order1.displayOrderDetails();
        System.out.println("\n--- Updating Tracking Status ---");
        order1.updateTrackingStatus("Out for Delivery");
        order1.displayOrderDetails();
    }
}