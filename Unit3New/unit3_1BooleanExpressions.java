public class unit3_1BooleanExpressions {
	
	
	public void booleanExp() {
	//Equal to ==
	//Not equal to !=
	//Remember Comparison of strings should be done with .equals() or .compareTo()
		int age1 = 78;
		int age2 = 23;
		
		boolean equals = age1==age2;
		// System.out.println("Using == "+equals);
		
		boolean notEquals = age1!=age2;
		// System.out.println("Using != "+notEquals);
		
	//Less than <
	//Greater than >
	
		boolean lessThan = age1<age2;
		// System.out.println("Using < "+lessThan);
		
		boolean greaterThan = age1>age2;
		// System.out.println("Using > "+greaterThan);
		
	//Less than or equal to <=
	//Greater than or equal to >=

		String some = "apple";
		String some2 = "apple";
		System.out.println("Strings "+!some.equals(some2));

		

		
		boolean lessThanOrEqual = age1<=age2;
		// System.out.println("Using <= "+lessThanOrEqual);
		
		boolean greaterThanOrEqual = age1>=age2;
		// System.out.println("Using >= "+greaterThanOrEqual);
	
	
		
	//Or ||
	//And &&
		
//		int age1 = 78;
//		int age2 = 23;

boolean testingAnd = age1>age2 && some.equals(some2);
		System.out.println("Using && "+testingAnd);
		boolean testingOR = age1>age2 || age1<age2;
		System.out.println("Using || "+testingOR);
		
		boolean orTest = age1>age2||(age1<age2&&(age1<=age2||age1>age2));
		// System.out.println("Using || "+orTest);
		
		boolean andTest = age1>=age2&&age1<=age2;
		// System.out.println("Using && "+andTest);
	
		
	
	
	}
}