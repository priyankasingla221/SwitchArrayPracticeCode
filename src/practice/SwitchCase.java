package practice;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number of Social App you want to Explore?" +"\n"+ "1 Whatsapp" 
		+"\n"+ "2 Facebook" +"\n" +"3 Instagram" +"\n" +"4 Snapchat");
		Scanner sc = new Scanner(System.in);
		int socialAppNumber = sc.nextInt();

		switch (socialAppNumber) {

		case 1:
			System.out.println("Welcome to Whatsapp");
			break;
		case 2:
			System.out.println("Welcome to Facebook");
			break;
		case 3:
			System.out.println("Welcome to Instagram");
			break;
		case 4:
			System.out.println("Welcome to Snapchat");
			break;
		default:
			System.out.println("Invalid Entry");

		}

	}

}
