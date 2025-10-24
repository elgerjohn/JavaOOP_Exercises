package Dog;

public class DogMain {
    //kani nga iro kay sa imagination lng po sir <3
    public static void main(String[] args) {
        Dog dog1 = new Dog("Blackie", "Labrador");
        Dog dog2 = new Dog("Whitey", "german shepherd");
        System.out.println(dog1.getName() + " is " + dog1.getBreed());
        System.out.println(dog2.getName() + " is " + dog2.getBreed());

        dog1.setName("Browney");
        dog1.setBreed("Golden Retriever");
         System.out.println(dog1.getName() + " is " + dog1.getBreed());
         dog2.setName("Greeny");
         dog2.setBreed("Poodle");
         System.out.println(dog2.getName() + " is " + dog2.getBreed());



        
    }
    
}
