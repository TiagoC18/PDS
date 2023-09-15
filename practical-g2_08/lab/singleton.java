package lab;

public class singleton {
    // Private static variable to hold the single instance of the class
    private static singleton instance;

    // Private constructor to prevent instantiation from other classes
    private singleton() {
        // Initialization code here, if needed
    }

    // Public static method to provide the global point of access to the instance
    public static singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }

    // Other methods and fields of the class can be defined here
}
