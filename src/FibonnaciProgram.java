
public class FibonnaciProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 10; 


        
        System.out.println("First " + n + " numbers of the Fibonacci series:");


        
        int first = 0, second = 1;


        
        System.out.print(first + " " + second + " ");


       
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");


         
            first = second;
            second = next;
        }
    }


}
