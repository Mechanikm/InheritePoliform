public class Cat extends Animal {

    Cat(String name) {
        super.setName(name);
        super.setSkill("catching mice");
    }

    @Override
    void trick() {
        System.out.println("I am a " + super.getName() + " and I like " + super.getSkill() + " if I want");
    }
}
