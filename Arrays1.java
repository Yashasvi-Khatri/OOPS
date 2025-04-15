import java.util.Scanner;


		// TODO Auto-generated method stubimport java.util.Scanner;
		class Arrays1 {
			public static int[] takeInput()
			{ Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int [] arr=new int[n];
			for(int i=0; i<n; i++) {
				System.out.println("Enter element at"+i+"the element");
				arr[i]=s.nextInt();	
			}
			return arr;
			}
			public static void returnArray(int []arr) {
				int n=arr.length;
				for(int i=0; i<n; i++) {
				System.out.println(arr[i]);
				
			}
			}
				public static void main(String[] args) {
				// TODO Auto-generated method stub	
				int[] arr= takeInput();
				returnArray(arr);
		}
		}


