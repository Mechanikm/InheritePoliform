abstract class Bird {
    private String name;
    private int height;
    private int weight;
    private String sound;
    private boolean isFly;

    public void voice() {
        System.out.println(sound);
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getSound() {
        return sound;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setFly(boolean isFly) {
        this.isFly = isFly;
    }
}
