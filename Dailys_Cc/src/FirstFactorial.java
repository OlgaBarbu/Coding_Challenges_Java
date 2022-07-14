import java.util.Scanner;

public class FirstFactorial {

	public static int FactorialOfNum(int num) {

		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			if (num == 1 || num == 0) {
				return 0;
			}
			factorial *= i;
		}

		return factorial;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Number input: ");
		int num = s.nextInt();
		System.out.println(" The Factorial of " + num + " is " + FactorialOfNum(num));

	}
}