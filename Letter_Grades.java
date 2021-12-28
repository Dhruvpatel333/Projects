import java.util.Scanner;

public class Letter_Grades {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input;
		char letterGrade;
		String msg = "ERROR You have entered an invalid input";
		
		System.out.println("Input a the number grade you recieved: ");
		input = scnr.nextInt();
		
		if(input < 0 || input > 100) {
			System.out.println("" + msg);
		}else if(input < 60) {
			letterGrade = 'F';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
		}else if(input <70) {
			letterGrade = 'D';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
		}else if(input < 80) {
			letterGrade = 'C';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
		}else if(input < 90) {
			letterGrade = 'B';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
		}else if(input <= 100) {
			letterGrade = 'A';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
		}
	}

}
