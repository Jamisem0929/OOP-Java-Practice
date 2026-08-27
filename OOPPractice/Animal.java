public class Animal
{
    //Fields
    private String name;
    private int age;
    private String breed;
        public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    //Getters
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
        public String getBreed() {
        return breed;
    }
    //Setter
    public void setAge(int age){
          if (age >= 0){
              this.age = age;
        }
    }
    public void setName(String name){
        if (!name.isEmpty()){
            this.name = name;   
        }
    }
    public void setBreed(String breed){
        if (!breed.isEmpty()){
            this.breed = breed;
        }
    }
    //other methods
     public void sleep() {
        System.out.printf("The animal is sleeping%n");
    }
}