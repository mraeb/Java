import java.util.Scanner;
public class MaxMinArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to be in the array");
		int n = sc.nextInt();
		int[] nums = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0; i<n; i++){
			nums[i] = sc.nextInt();

		}
		int max = nums[0];
		int min = nums[0];
		System.out.println("The given array elements are: ");
		for(int i=0; i<n; i++){
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		for(int i=0; i<n; i++){
			if(nums[i]>max){
				max = nums[i];
			} else {
				min = nums[i];
			}
		}
		System.out.println("The Maximum value of the given array is "+max);
		System.out.println("The Minimum value of the given array is "+min);

	}
}
