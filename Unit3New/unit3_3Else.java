
public class unit3_3Else {
	
public void ifTesting() {
		
		//if (something is true) {Do this} else {do this}
		
		int howOld = 67;
		System.out.println("Are you old?");
		
		if (howOld<=40) {
			System.out.println("Yes you're old.");
		} else if (howOld>=40) {
			System.out.println("Yes you're old number 2.");
		}
		else {
			//else is the catch all.
			System.out.println("You are not old.");
		}

		if (howOld>=40) {
			System.out.println("Yes you're old.");
		}
	}

}