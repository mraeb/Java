import java.util.Scanner;
public class ArraySumAvg{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		int sum = 0;
		System.out.println("Enter the array elements one by one");
		for(int i = 0; i < 5; i++){
			nums[i] = sc.nextInt();
			sum += nums[i];
		}
		int avg = sum/nums.length;
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
	}
}


