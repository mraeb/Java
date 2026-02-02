import java.util.Scanner;
public class ReverseNumber{
	public static void main(String[] args){
		// Get number input and print reversed number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be reversed: ");
		int num = sc.nextInt();
		int reversed = 0;
		int digit = 0;
		while(num>0){
			digit = num % 10;
			reversed = reversed*10+digit;
			num = num / 10;
		}
		System.out.println("The reversed number is: "+reversed);
	}
}
