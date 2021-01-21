package main.creational.singleton;

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

    // this creates problems when multi-threading is introduced.
//    private static A instance;
//    public static A getInstance() {
//        if(instance == null) instance = new A();
//        return instance;
//    }

    // solves multi-threading problem
    // but creates performance issues.
//    private static A instance;
//
//    public synchronized static A getInstance() {
//        if (instance == null) instance = new A();
//        return instance;
//    }

    // this solves the multi-threading problem.
    // and performance problem
    // as the check if the synchronized block
    // happens only once at the object first time creation.
    // might not be suitable for all java versions though.
//    private static A instance;
//
//    public static A getInstance() {
//        if (instance == null)
//            synchronized(A.class) {
//                if(instance == null)
//                    instance = new A();
//            }
//        return instance;
//    }

}
