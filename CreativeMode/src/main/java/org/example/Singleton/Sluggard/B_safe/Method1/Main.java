package org.example.Singleton.Sluggard.B_safe.Method1;


public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(Singleton::createInstance,String.valueOf(i)).start();
        }
    }
}
