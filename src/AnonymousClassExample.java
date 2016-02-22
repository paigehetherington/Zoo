/**
 * Created by vajrayogini on 2/22/16.
 */
public class AnonymousClassExample {
    public static void main(String[] args) {
        Reptile alligator = new Reptile() { //instead of closing off create {}, can override stuff here

            @Override
            public void makeSound() {
                System.out.println("Croak");
            }
        };
        alligator.name = "Alligator"; //calling this.name outside of obect

        alligator.makeSound();
    }
}
