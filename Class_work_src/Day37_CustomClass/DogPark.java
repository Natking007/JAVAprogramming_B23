package Day37_CustomClass;

public class DogPark {

    public static void main(String[] args){

        Dog dog1 = new Dog();// so here is where we call the "Dog" class that
        // you created
        dog1.name = "Kangal";
        dog1.gender = "Female";
        dog1.breed = "Kangal";
        dog1.age = 5;
        dog1.size = "large";
        dog1.color = "yellowish brown";


        System.out.println( dog1.name );
        System.out.println(dog1.gender);
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.color);
    }
}
