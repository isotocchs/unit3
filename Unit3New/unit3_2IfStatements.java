import java.util.Scanner;

public class unit3_2IfStatements {
	
	
	public void ifTesting() {
		
		//if (something is true) {Do this}
		// System.out.println("----------------------");
		int howOld = 78;
		System.out.println("Are you old?");
		// boolean howOldBool = howOld>=40;
		String testing = "";
		if (howOld>=40) {
			testing = "Yes but not that old";
			if (howOld >= 60) {
				testing = "Yes you're old.";

			}
		}
		// if (howOld==40) {
		// 	testing = "No, you're not old.";

		// }
		System.out.println(testing);

        // System.out.println("----------------------");

	}
		
	

	
	public void saySomething() {
        // System.out.println("----------------------");


		// Scanner inputInfo = new Scanner(System.in);
		// System.out.print("what is your word ");
		// String talking = inputInfo.next();
		// talking += inputInfo.nextLine();
		
		// if (talking.length()<=2) {
		// 	System.out.println("You must say more than a letter.");
			
		// }
		// if (talking.length()>=2) {
		// 	System.out.println("Thank you for saying something.");
		// 	System.out.println("This is what you said: "+talking);
		// }
		
		// if (talking.length()>=2 && !talking.equals("applesauce")) {
		// 	System.out.println("You have not said the secret word. Try again.");
		// 	saySomething();
		// }
		// if (talking.length()>=2 && talking.equals("applesauce")) {
		// 	System.out.println("You have said the secret word. Congratulations!!!");
		// }
		
System.out.println("----------------------");

		
	}

}