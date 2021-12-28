import java.util.Scanner;

public class Letter_Grades_Switch {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input;
		char letterGrade;
		String msg = "ERROR You have entered an invalid input";
		
		System.out.println("Input a the number grade you recieved: ");
		input = scnr.nextInt();
		
		switch(input/10) {
		case 0 :
			letterGrade = 'F';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
			break;
		
		case 1:
			letterGrade = 'F';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
			break;
		
		case 2:
			letterGrade = 'F';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
			break;
		
		case 3:
			letterGrade = 'F';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
			break;
		
		case 4:
			letterGrade = 'F';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
			break;
		
		case 5:
			letterGrade = 'F';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
			break;
		
		case 6:
			letterGrade = 'D';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
			break;
		
		case 7:
			letterGrade = 'C';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
			break;
		
		case 8:
			letterGrade = 'B';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
			break;
		
		case 9:
			letterGrade = 'A';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
			break;
		
		case 10:
			letterGrade = 'A';
			System.out.printf("You have earned the letter grade: %c", letterGrade);
			break;
		default: 
			System.out.println(msg);
			break;
		
		
		
		}
	}

}
