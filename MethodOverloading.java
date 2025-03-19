public class MethodOverloading {
    public static void main(String[] args) {
        printValue(10);       // Calls int method
        printValue(3.14);     // Calls double method
        printValue("Hello!"); // Calls String method
    }

    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}
