import java.util.Random;


public class CheckPrime {
    public static void main(String[] args) {
        
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;


        System.out.println("Generated random number: " + randomNumber);


        
        if (isPrime(randomNumber)) {
            System.out.println(randomNumber + " is a prime number.");
        } else {
            System.out.println(randomNumber + " is not a prime number.");
        }
    }


    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }


        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }


        return true; // Number is prime
    }
}
