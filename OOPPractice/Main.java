public class Main {
    public static void main(String[] args){
        Dog dog1 = new Dog("Max", 3 , "Labrador");
        Dog dog2 = new Dog("Charlie" , 7 , "Beagle");
        
        dog1.bark();
        dog1.sleep();
        Cat cat1 = new Cat("luna", 4 , "Siamese");
        System.out.printf("%s%n%d%n%s%n" , cat1.name , cat1.age , cat1.breed);
     
    }
}