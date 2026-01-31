import java.util.Scanner;
public class Calc{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to mraeb's Two Number Calc!...");
		System.out.println("Enter the First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int num2 = sc.nextInt();
		System.out.println("Sum: "+(num1+num2));
		System.out.println("Sub: "+(num1-num2));
		System.out.println("Multi: "+(num1*num2));
		System.out.println("Divide: "+(num1/num2));

	}
}
