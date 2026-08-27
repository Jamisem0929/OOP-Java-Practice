public class Main {
    public static void main(String[] args){
        Animal[] animals = {
            new Dog("Max" , 4, "labrador"),
            new Cat("luna", 3, "Siamese"),
            new Dog("Buddy", 2, "Beagle")
        };
        
        for (Animal animal : animals){
            animal.makeSound();
        }
    }
}