package main.singleton;

public class A {
    private A() {
    }
    /*
    * When the singleton class is loaded, inner class is not loaded and
    * hence doesn’t create object when loading the class.
    * Inner class is created only when getInstance() method is called.
    *  So it may seem like eager initialization but it is lazy initialization.
    * This is the most widely used approach as it doesn’t use synchronization.
    * */
    // Inner class to provide instance of class
    private static class BillPughSingleton {
        private static final A INSTANCE = new A();
    }

    public static A getInstance() {
        return BillPughSingleton.INSTANCE;
    }
}
