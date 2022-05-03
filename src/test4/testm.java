package test4;
import java.util.Scanner;

public class testm {
	private static Scanner sc;
	public static void main(String[] args) {
		
		//Declaring variables
		String inputString;
		char maxCharCnt = ' ';
		int i, max = 1;
		int[] charOccurncs = new int[256];
		
		//Taking inputs
		sc= new Scanner(System.in);
		System.out.print("\n Enter String to find the maximum occurring character:  ");
		inputString = sc.nextLine();
		
		//Create array of character 
		for(i = 0; i < inputString.length(); i++)
		{
			charOccurncs[inputString.charAt(i)]++;
		}
		
		//Get the maximum occurring character
		for(i = 0; i < inputString.length(); i++) 
		{
			char ch = inputString.charAt(i);
			if(max < charOccurncs[ch]) {
				max = charOccurncs[ch];
				maxCharCnt = ch;
			}
		}
		
		//Print output
		System.out.println("\n The maximum occurring character = " +  maxCharCnt);
		System.out.format("The '%c' character occured a total of %d times.", maxCharCnt, max);	

		
	}
}
	