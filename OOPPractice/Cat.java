public class Cat extends Animal {
    private String name;
    private int age = 0;
    private String breed;
    public Cat(String name , int age, String breed){
        super(name , age , breed);
    }
    //other methods
    void meow(){
        System.out.printf("Meow%n");
    }
}