import java.util.Scanner;

public class PowerOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base number: ");
		int base = sc.nextInt();
		System.out.println("Enter Exponent number: ");
		int exponent = sc.nextInt();
		int res = 1;
		for (int i = 1; i <= exponent;i++) {
			res *= base;
		}
		
		System.out.println(base+ " raised to the power of "+exponent+" is: "+ res);
		sc.close();
	}

}
