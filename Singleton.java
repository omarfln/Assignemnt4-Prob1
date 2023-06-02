public class Singleton {
    private static Singleton[] singletonObj = new Singleton[3];

    private Singleton() {
        System.out.println("I'm singleton");
    }

    public static Singleton getSingletonObj() {
        for (int i = 0; i < 3; i++) {
            if (singletonObj[i] == null) {
                System.out.println("Entered" + i);
                singletonObj[i] = new Singleton();
                return singletonObj[i];
            }
        }
        System.out.println("Already created, returning last one!");
        return singletonObj[2];
    }
}
