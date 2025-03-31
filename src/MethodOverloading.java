public class MethodOverloading {

    // Method with one integer parameter
    public void display(int num) {
        System.out.println("Integer: " + num);
    }

    // Method with one double parameter
    public void display(double num) {
        System.out.println("Double: " + num);
    }

    // Method with two parameters (int and String)
    public void display(int num, String text) {
        System.out.println("Integer: " + num + ", String: " + text);
    }

    // Method with two parameters (String and int)
    public void display(String text, int num) {
        System.out.println("String: " + text + ", Integer: " + num);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // Calling overloaded methods
        obj.display(10);
        obj.display(10.5);
        obj.display(25, "Hello");
        obj.display("World", 50);
    }
}
