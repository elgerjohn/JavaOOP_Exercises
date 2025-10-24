package Pet;

public class PetMain {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex", 4, "Teddybear");
        Bird myBird = new Bird("Winnie", 2, 25.5);

        myDog.displayPetDetails();
        System.out.println();
        myBird.displayPetDetails();
    }
}