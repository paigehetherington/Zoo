/**
 * Created by vajrayogini on 2/9/16.
 */
public class Animal {
    public String name;

    public void makeSound() {
        System.out.println("Nothing");
    }
    @Override                     //returns string to object Hawk
    public String toString() {
        return this.name;
    }
}
