import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int Output = (int)(A/(C-B));
		
		if(Output+1 >= 1) {
			System.out.println(Output+1);
		}
		else {
			System.out.println(-1);
		}
		
	}
}
