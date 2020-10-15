package com.employee;
import java.util.Scanner;
public class SubjectGrade 
{
	public static void main(String[] args)
	{
		int english,hindi,science,maths,computer;
		float total,percentage;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter five subject marks :");
		english=sc.nextInt();
		hindi=sc.nextInt();
		science=sc.nextInt();
		maths=sc.nextInt();
		computer=sc.nextInt();
	
		total=english+hindi+science+maths+computer;
		percentage=(total/500)*100;
		 
		System.out.println("total marks: " +total);
		System.out.println("percentage: "+percentage);
		
		if(percentage>=90)
		{
			System.out.println("Grade A");
		}
		else if(percentage>=80)
		{
			System.out.println("Grade B");
		}
		else if(percentage>=70)
		{
			System.out.println("Grade C");
		}
		else if(percentage>=60)
		{
			System.out.println("Grade D");
		}	
		else if(percentage>=40)
		{
			System.out.println("Grade E");
		}
		else 
	{
		System.out.println("Fail");
	}
	
}
}