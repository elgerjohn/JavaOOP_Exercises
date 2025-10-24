package Movie;

import java.util.ArrayList;
import java.util.List;


public class MovieMain {
    public static void main(String[] args) {
        List<String> actors = new ArrayList<>();
        actors.add("albert");
        actors.add("tom");
        
        Movie movie = new Movie("Angel Next Door", "Hanayama", actors);
        System.out.println("Title: " + movie.getTitle());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Actors: " + movie.getActors());
        
        movie.setReview("Great movie!");
        movie.setReview("Excellent acting.");
        System.out.println("Reviews: " + movie.retrieveReviews());
        
        movie.setTitle("Your Name");
        System.out.println("Updated Title: " + movie.getTitle());
    }
}
