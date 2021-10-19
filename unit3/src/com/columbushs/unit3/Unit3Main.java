package com.columbushs.unit3;

import java.awt.Rectangle;
import java.util.Scanner;

public class Unit3Main {

	public static void main(String[] args) {
		Unit3_1BooleanExpressions boolTest = new Unit3_1BooleanExpressions();
		//boolTest.booleanExp();
		
		Unit3_2IfStatements ifTests = new Unit3_2IfStatements();
		//ifTests.ifTesting();
		//ifTests.saySomething();
		
		Unit3_3IfElse ifElse = new Unit3_3IfElse();
		//ifElse.ifTesting();
		
		Unit3_4ElseIf elseIfs = new Unit3_4ElseIf();
		//elseIfs.saySomething();
		
		Unit3_5CompoundBooleanExp moreIfs = new Unit3_5CompoundBooleanExp();
		//moreIfs.nestedIfs();
		
		Unit3_6EquivalentBoolean bools = new Unit3_6EquivalentBoolean();
		//System.out.println(bools.C);
//		boolean boolStuff;
//		int val = 1900;
//		if((val%4)==0) {
//			boolStuff = true;
//		} else {
//			boolStuff = (val%400)==0;
//		}
//		System.out.println(boolStuff);
		
		//Object info and memory
		Unit3_7ComparingObjects person1 = new Unit3_7ComparingObjects("Bob",23,6);
		
		Unit3_7ComparingObjects person2 = new Unit3_7ComparingObjects("Bob",23,6);
		
		Unit3_7ComparingObjects person3 = person1;
		
		Unit3_7ComparingObjects person4;
		
//		boolean same = person1==person2;
//		//System.out.println(same);
//		
		boolean same2 = person1.equals(person3);
		System.out.println(same2);
//		
//		boolean same3 = person1.age==person2.age;
//		//System.out.println(same3);
		
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
