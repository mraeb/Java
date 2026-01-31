public class TenNumbers{
	public static void main(String[] args){
		int sum = 0;
		for(int i=0; i<10; i++){
			System.out.println(i+1);
			sum +=(i+1);
		}
		System.out.println("Sum of 1-10 is: "+sum);
	}
}
