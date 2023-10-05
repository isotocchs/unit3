
public class unit3_3Else {
	
public void ifTesting() {
		
		//if (something is true) {Do this} else {do this}
		
		int grade = 90;
		int extraCredit = 10;
		if (grade >= 90) {
			if (extraCredit >= 10){
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if (grade >= 80) {
			if (extraCredit >= 10){
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println(":-(");
		}
	}

}