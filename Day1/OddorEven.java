import java.util.Scanner;
public class OddorEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check odd or even");
		int num = sc.nextInt();
		if(num%2==0){
			System.out.printf("The given number %d is a even number",num);
		}
		else{
			System.out.printf("The given number %d is odd number", num);
		}
	}
} 
