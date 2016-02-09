/**
 * Created by vajrayogini on 2/9/16.
 */
public class Dog extends Mammal{ //dog extends mammal and animal
    public Dog() {
        this.name = "Dog";
    }
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

}
