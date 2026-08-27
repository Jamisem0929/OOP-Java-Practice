
public class Dog extends Animal{
    //Fields
    private String name;
    private int age;
    private String breed;
    public Dog(String name , int age, String breed){
        super(name , age , breed);
    }
    //other methods
    void bark() {
        System.out.printf("%s says Woof!%n" , name);
    }
    @Override
    public void sleep(){
        System.out.printf("The dog goes to sleep%n");
    }
}
