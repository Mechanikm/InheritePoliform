public class Raven extends Bird {

    String[] sound;

    Raven() {};

    public Raven(String name, int height, int weight, String sound, boolean isFly) {
        super.setName(name);
        super.setHeight(height);
        super.setWeight(weight);
        super.setSound(sound);
        super.setFly(isFly);
    }

    public Raven(String name, int height, int weight, String[] sound, boolean isFly) {
        super.setName(name);
        super.setHeight(height);
        super.setWeight(weight);
        super.setFly(isFly);
        this.sound = sound;
    }

    @Override
    public void voice() {
        if (this.sound != null) {
            for (int i = 0; i < sound.length && i < 5; i++) {
                System.out.println(sound[i]);
            }
        } else {
            if (super.getSound() != null) {
                System.out.println(super.getSound());
            } else {
                System.out.println("It's silent");
            }
        }
    }
}
