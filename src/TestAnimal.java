public class TestAnimal {

    public static void main(String[] args) {

        Dog dog = new Dog("Ein");
        System.out.println(dog.getName());
        dog.trick();
        
        Animal cat = new Cat("Tom");
        cat.trick();
    }
}
