import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check prime or not: ");
		int num = sc.nextInt();
		//if(num%2!=0 || num%3!=0 || num%5!=0){
		//	System.out.printf("%d is a prime number.", num);
		//}
		//else{
		//	System.out.printf("%d is not a prime number.", num);
		//}
		boolean prime = true;
		
		if(num < 2){
			prime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0){
					prime = false;
					break;
				}
			}
		}
		if(!prime){
			System.out.printf("%d is not a prime number.", num);
		} else{
			System.out.printf("%d is a prime number.", num);
		}
	}
}
