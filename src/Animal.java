abstract public class Animal {

    private String name;
    private String species;
    private String skill = "to do nothing";
    private int age;

    void trick() {
        System.out.println("I am a " + name + " and I like " + skill);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal [age=" + age + ", name=" + name + ", skill=" + skill + ", species=" + species + "]";
    }

}
