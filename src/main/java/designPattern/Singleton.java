package designPattern;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton instance = null;

    private Singleton() {
        // this prevents the Reflection and clone
        if (instance != null) {
            throw new RuntimeException("You have broken Singleton class!");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }
}
