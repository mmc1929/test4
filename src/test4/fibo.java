package test4;
import java.util.Scanner;

class fibo {
	private static Scanner sc;
	public static void main(String[] args) {

		int n = 0, a = 0, b = 1;
	    
		//Taking inputs
		sc= new Scanner(System.in);
		System.out.print("\n Enter the size of the desired fibonacci series:  ");
		n = sc.nextInt();
		
		
	    System.out.println("Fibonacci Series till " + n + " terms:");
	
	    for (int i = 1; i <= n; ++i) {
	      System.out.print(a + ", ");
	
	      // compute the next term
	      int c = a + b;
	      a = b;
	      b = c;
    }
  }
}