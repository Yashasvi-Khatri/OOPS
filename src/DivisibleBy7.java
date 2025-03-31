
public class DivisibleBy7 {

	public static void main(String[] args) {
		
		int sum = 0;

        for (int i = 101; i < 200; i++) {
            if (i % 7 == 0) { 
                sum += i;
            }
        }

        // Print the sum
        System.out.println("Sum of numbers between 100 and 200 divisible by 7: " + sum);
    }
}

