import java.util.Scanner;

//This is a program to find the day name by the integer input 
//Ex: 1 --> Monday, 7 --> Sunday, invalid --> Wrong Input

public class DayOfWeek{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number 1-7 to get name of the day:");
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Wrong Input");
		}
	}
}
