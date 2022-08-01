public class Test {

    public static void main(String[] args) {

        Raven raven1 = new Raven("First", 300, 300, "Kru", true);
        
        System.out.println(raven1.getClass());
        System.out.println(raven1.getName());
        System.out.println(raven1.getHeight());
        System.out.println(raven1.getWeight());
        System.out.println(raven1.isFly());
        raven1.voice();
        System.out.println();

        String[] newSound = { "A", "B", "C", "D", "E", "F", "G", "H" };
        Raven raven2 = new Raven("Second", 330, 330, newSound, true);

        System.out.println(raven2.getClass());
        System.out.println(raven2.getName());
        System.out.println(raven2.getHeight());
        System.out.println(raven2.getWeight());
        System.out.println(raven2.isFly());
        raven2.voice();
        System.out.println();

        Bird badRaven = new Raven();
        badRaven.setName("Zhorik");
        System.out.println(badRaven.getClass());
        System.out.println(badRaven.getName());
        System.out.println(badRaven.getHeight());
        System.out.println(badRaven.getWeight());
        System.out.println(badRaven.isFly());
        badRaven.voice();
        System.out.println();

        Hen hen = new Hen("Ryaba", 50, 1000, "Ko-Ko", false);
        hen.productivity = 5;
        hen.voice();
    }
}
