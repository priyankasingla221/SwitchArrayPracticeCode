package practice;

import java.util.Scanner;

import javax.security.auth.Subject;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//First way
		/**int[] numberList = {10,20,30,40};
		String[] socialApps = {"Whatsapp", "Instagram", "Snapchat","Facebook"};
		System.out.println("Printing number at Index 2 :" +numberList[2]);
		System.out.println("Printing socialApp at Index 1:" +socialApps[1]);
	**/
	//Second Way
	
	int[] percentage= new int[10];
	double[] gpa = {0};
	String[] subject = new String[5];
	percentage[0]=85;
	percentage[1]=50;
	percentage[2]=65;
	percentage[3]=80;
	percentage[4]=100;
	gpa[0]=4.2;
	subject[0] ="Math";
	subject[1]="Science";
	subject[2]="English";
	subject[3]="Punjabi";
	subject[4]="FinalResult";
	Scanner sc = new Scanner(System.in);
	System.out.println("Choose subject from followings for Result" +"\n" +"Math, Science, English, Punjabi, FinalResult");
	String choosingSubject = sc.next();
	
	switch(choosingSubject){
	case "Math":
		System.out.println(subject[0] + " = " +percentage[3]);
		break;
	case "Science":
		System.out.println(subject[1]+ " = " +percentage[2]);
		break;
	case "English":
		System.out.println(subject[3]+ " = " +percentage[5]);
		break;
	case "Punjabi":
		System.out.println(subject[4]+ " = " +percentage[4]);
		break;
	case "FinalResult":
		System.out.println("Math= " +percentage[3] +"\n" +"Science= " +percentage[2]+ "\n"+
				"English= " +percentage[5] +"\n" +"Punjabi= " +percentage[4] + "\n" +"FINAL GPA=  " +gpa[0] );
		break;
		default:
			System.out.println("Invalid Entry! Please try again");		
		
	}
	
	}

}
