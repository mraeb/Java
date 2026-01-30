import java.util.Scanner;
class GradeCheck{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mark to check grade");
		int mark = sc.nextInt();
		if(mark >=90){
			System.out.println("Grade A");
		}
		else if (mark >= 80){
			System.out.println("Grade B");
		}
		else if (mark >= 60){
			System.out.println("Grade C");
		}
		else{
			System.out.println("Grade D");
		}
	}
}
