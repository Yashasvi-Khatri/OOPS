public class UncheckedException {
    public static void main(String[] args) {
        try {
            
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }

   
    public static int divide(int a, int b) {
    	return a / b; 
    }
    }