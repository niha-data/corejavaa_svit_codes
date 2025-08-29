package org.tnsif.sf.c2tc.ScannerClassDemo;
import java.util.Scanner;
public class ScannerAllMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scan.nextLine();
		
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
		System.out.println("Enter your height");
		float height = scan.nextFloat();
		
		System.out.println("Are u a student");
		boolean isstdent =scan.nextBoolean();
		
		System.out.println("Enter your aadhar number");
		long aadhar = scan.nextLong();
		scan.nextLine();
		
		System.out.println("Enter your favourite teacher");
		String teacher=scan.nextLine();
		
		System.out.println("Enter your hobby");
		String hobby = scan.nextLine();
		
		System.out.println("Enter your daily reading times in minutes");
		byte readingtime = scan.nextByte();
		
		System.out.println("Enter your CGPA");
		double cgpa = scan.nextDouble();
		
		System.out.println("Enter no. of siblings you have");
		short siblings = scan.nextShort();
		
		System.out.println("Student Information");
		System.out.println("Name " + name);
		System.out.println("age " + age);
		System.out.println("height " + height);
		System.out.println("isstdent " + isstdent);
		System.out.println("aadhar " + aadhar);
		System.out.println("Favourite teacher " +  teacher);
		System.out.println("hobby " + hobby);
		System.out.println("readingtime " + readingtime);
		System.out.println("cgpa " + cgpa);
		System.out.println("siblings " + siblings);
		scan.close();
;
		}

}
