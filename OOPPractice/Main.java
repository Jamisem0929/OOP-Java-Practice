public class Main {
    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.name = "Max";
        dog1.age = 3;
        dog1.breed = "Labrador";
        Dog dog2 = new Dog();
        
        dog2.name = "Charlie";
        dog2.age = 7;
        dog2.breed = "Beagle";
        
        dog1.bark();
        dog1.sleep();
        Cat cat1 = new Cat("luna", 4 , "Siamese");
        System.out.printf("%s%n%d%n%s%n" , cat1.name , cat1.age , cat1.breed);
     
    }
}