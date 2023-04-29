package gr.aueb.cf.ch14.singleton;

/**
 * POJO class - Singleton
 * Lazy Instantiation
 */
public class CodingFactoryLazy {
    private static CodingFactoryLazy INSTANCE = null;

    private CodingFactoryLazy() {}

    public static CodingFactoryLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CodingFactoryLazy();
        }

        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}