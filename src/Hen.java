public class Hen extends Bird {

    int serial;
    int productivity;

    public Hen(String name, int height, int weight, String sound, boolean isFly) {
        super.setName(name);
        super.setHeight(height);
        super.setWeight(weight);
        super.setSound(sound);
        super.setFly(isFly);
    }  
}
