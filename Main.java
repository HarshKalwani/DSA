class Animal{
    String color ; 
    String name ;
    String breed ;
    int age;

    void run(){
        System.out.println(name + " is running");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal doggy = new Animal();
        dog.name = "Tuff";
        dog.age = 2;
        dog.breed = "lab";
        dog.color= "Golden";

        doggy.name="paa";
        doggy.age=3;
        doggy.breed="dish";
        doggy.color="pink";

        System.out.println(dog.name);
        dog.run();
        doggy.run();
    }
}