public class Cat extends Animal {
    private String name;
    private int age = 0;
    private String breed;
    public Cat(String name , int age, String breed){
        super(name , age , breed);
    }
    //other methods
    @Override
    public void sleep() {
        System.out.printf("The cat curls and goes to sleep.%n");
    }
    @Override
    public void makeSound(){
        System.out.printf("Meow!%n");
    }
}