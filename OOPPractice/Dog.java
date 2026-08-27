
public class Dog extends Animal{
    //Fields
    private String name;
    private int age;
    private String breed;
    public Dog(String name , int age, String breed){
        super(name , age , breed);
    }
    //other methods
    @Override
    public void sleep(){
        System.out.printf("The dog goes to sleep%n");
    }
    @Override
    public void makeSound(){
        System.out.printf("Woof!%n");
    }
}
