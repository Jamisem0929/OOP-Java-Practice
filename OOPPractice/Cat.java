public class Cat {
    String name;
    int age = 0;
    String breed;
    public Cat(String name , int age, String breed){
        this.name = name; 
        this.age = age;
        this.breed = breed;
    }
    
    void meow(){
        System.out.printf("Meow%n");
    }
    void sleep(){
        System.out.printf("ZZZ%n");
    }
}