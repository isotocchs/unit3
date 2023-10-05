import java.util.Scanner;

public class unit3_5CompoundExpressions {
	
	public void nestedIfs() {
		
		Scanner inputInfo = new Scanner(System.in);
		System.out.println("What is the number you want to check?");
		double number = inputInfo.nextDouble();
		System.out.println("What is the secon number you want to check?");
		double number2 = inputInfo.nextDouble();
		System.out.println("What operation?");
		String operation = inputInfo.next();
		if (operation.equals("+")){
					System.out.println(number+number2);
		} else {
					System.out.println("I can only do addition");

		}

		// if (number > 34){
		// 	System.out.print("Hello");
		// }
		// else if (number>10) {
		// 	System.out.println("The number is greater than 10.");
		// 	if (number%5 ==0) {
		// 		System.out.println("The number is greater than 10 and divisible by 5.");
		// 	} else {
		// 		System.out.println("The number is greater than 10 but not divisible by 5.");
		// 	}
		// 	System.out.println("The number is greater than 10 Againnnnnn.");

		// } else {
		// 	System.out.println("The number is not greater than 10.");

		// 	if (number%5 ==0) {
		// 		System.out.println("The number is not greater than 10 and divisible by 5.");
		// 	} else {
		// 		System.out.println("The number is not greater than 10 but not divisible by 5.");
		// 	}
		// }
		//Careful with curly brackets and which ifs and elses go together.

	}

}