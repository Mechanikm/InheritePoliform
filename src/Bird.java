public class Bird {
    private String name;
    private int height;
    private int weight;
    private boolean isFly;

    public Bird(String name, int height, int weight, boolean isFly) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.isFly = isFly;
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

    public boolean isFly() {
        return isFly;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
