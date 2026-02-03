import java.util.Scanner;
public class ReverseArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements to be in the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements ");
		int[] nums = new int[n];
		for(int i=0; i<n; i++){
			nums[i] = sc.nextInt();
		}
		System.out.print("The given array: ");
		for(int i=0; i<n; i++)
			System.out.print(nums[i]+" ");
		System.out.println();
		int[] temp = new int[n];
		for(int i=0; i<n; i++){
			temp[i] = nums[n-i-1];
		}
		for(int i=0; i<n; i++)
			nums[i] = temp[i];
		System.out.print("The reversed array is: ");
		for(int i=0; i<n; i++)
			System.out.print(nums[i]+" ");
	}
}
		

		
