package Event;

import java.util.*;

public class EventMain {
    public static void main(String[] args) {
        Seminar seminar = new Seminar("Graduation", "2025-11-15", "Municipal Gym", 5);
        MusicalPerformance concert = new MusicalPerformance(
                "Araw",
                "2025-11-15",
                "Municipal Gym",
                Arrays.asList("The Voltages", "Luna Beats", "DJ Maxx")
        );
        MusicalPerformance concert2 = new MusicalPerformance(
                "Jazz Night",
                "2025-12-01",
                "Grand Hall",
                Arrays.asList("Smooth Trio", "Ella Vibes")
        );

        seminar.displayDetails();
        concert.displayDetails();
        concert2.displayDetails();

        System.out.println("Checking event conflicts...");
        checkConflict(seminar, concert);
        checkConflict(seminar, concert2);
        checkConflict(concert, concert2);
    }

    
    public static void checkConflict(Event e1, Event e2) {
        if (e1.isConflict(e2)) {
            System.out.println(" Conflict detected between \"" + e1.getEventName() + "\" and \"" + e2.getEventName() + "\" on " + e1.getDate() + " at " + e1.getLocation() + ".");
        } else {
            System.out.println(" No conflict between \"" + e1.getEventName() + "\" and \"" + e2.getEventName() + "\".");
        }
    }
}
