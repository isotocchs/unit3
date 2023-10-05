
import java.awt.Rectangle;
import java.util.Scanner;

public class unit3_main {

	public static void main(String[] args) {
		unit3_1BooleanExpressions boolTest = new unit3_1BooleanExpressions();
				System.out.println("----------------------");

		// boolTest.booleanExp();

		unit3_2IfStatements ifTests = new unit3_2IfStatements();
		// ifTests.ifTesting();
		// ifTests.saySomething();
		
		unit3_3Else ifElse = new unit3_3Else();
		// ifElse.ifTesting();
		
		unit3_4ElseIf elseIfs = new unit3_4ElseIf();
		// elseIfs.saySomething();

		
		System.out.println("----------------------");

		unit3_5CompoundExpressions moreIfs = new unit3_5CompoundExpressions();
		moreIfs.nestedIfs();
		
		unit3_6EquivalentBool bools = new unit3_6EquivalentBool();
		//System.out.println(bools.D);
		// boolean boolStuff;
		// int val = 1900;
		// if((val%4)==0) {
		// 	boolStuff = true;
		// } else {
		// 	boolStuff = (val%400)==0;
		// }
		// System.out.println(boolStuff);
		
		//Object info and memory
		unit3_7ComparingObjects person1 = new unit3_7ComparingObjects("Bob",23,6);
		
		unit3_7ComparingObjects person2 = new unit3_7ComparingObjects("Bob",23,6);
		
		unit3_7ComparingObjects person3 = person1;
		
		unit3_7ComparingObjects person4;
		person4 = new unit3_7ComparingObjects("Bob",23,6);

// 		boolean same = person1==person4;
// 		System.out.println("----------------------");
// 		System.out.println(person1);
// 		System.out.println(person4);
// 		System.out.println(same);
// //		
// 		boolean same2 = person1.equals(person2);
// 		System.out.println(same2);
// //		
// 		boolean same3 = person1.age==person2.age;
// 		System.out.println(same3);


System.out.println("----------------------");

//		String prob;		
//		// what about the others?
//		System.out.println("What do you want? ");
//		Scanner problem = new Scanner(System.in);
//		prob = problem.next();
//		
//		if (prob.equals("testing")) {
//			System.out.println("Testing");
//		}
//		if (prob.equals("problem")) {
//			System.out.println("problem");
//		}
	
		

	}

}