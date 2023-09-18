import java.util.Scanner;
public class app {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int month; 
		int numberOfDays = 0;
		boolean isLeapYear;
		
		System.out.println("Enter the month as an integer, e.g. '1' for January or '11' for November.");
		month = keyboard.nextInt();
		
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numberOfDays=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numberOfDays=30;
			break;
		case 2:
			System.out.print("Leap Year (true/false)?");
			isLeapYear = keyboard.nextBoolean();
			
			if(isLeapYear){
				numberOfDays = 29;
			} else{ 
				numberOfDays = 28;
			}
			break;
		default: 
			System.out.println("Invalid Entry");
			
		}
		
		if(numberOfDays !=0)
		{
			System.out.print(numberOfDays);
			System.out.print(" days.");
		}
		
		keyboard.close();
	}
}
