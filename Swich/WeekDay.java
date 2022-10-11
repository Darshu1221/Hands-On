/**Program to demonstrate(Switch) asnd printing week days
* date:- 11/10/22
*/


package Swich;
import java.util.Scanner;



public class WeekDay {
	public static void main(String[] args) {
		// take input form the User.
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the Number(1-7) :");

		int ND = sc.nextInt();
		switch (ND) {
		case 1:

			System.out.println("This is Monday");
			break;

		case 2:

			System.out.println("This is Tuesday");
			break;

		case 3:

			System.out.println("This is Wednesday");
			break;

		case 4:

			System.out.println("This is Thursday");
			break;

		case 5:

			System.out.println("This is Firday");
			break;

		case 6:

			System.out.println("This is Saturday");
			break;

		case 7:

			System.out.println("This is Sunday");
			break;

		default:
			System.out.println(ND + " Day does not Present!!");
			break;

		}
		sc.close();
	}
}
