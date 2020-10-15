package com.employee;
import java.util.Scanner;
public class EmployeeTax {

	public static void main(String[] args) 
	{
	
		String name;
		int dob,mob,yob,monthly_salary,tax;
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Your name");
		name=sc.nextLine();	

		System.out.println("Enter Your Day of birth");
		dob=sc.nextInt();

		System.out.println("Enter Your Month of birth in digit");
		mob=sc.nextInt();

		System.out.println("Enter Your Year of birth in digit");
		yob=sc.nextInt();

		System.out.println("Enter Your Monthly Salary");
		monthly_salary =sc.nextInt();
		int age = 2020-yob;

		int annual_salary = (monthly_salary * 12);

		if(annual_salary >=500000) {
			tax= (annual_salary * 20) / 100;
			System.out.println(name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax amount is "+ tax);
		}
		else if(annual_salary >=400000) {
			tax= (annual_salary * 15) / 100;
			System.out.println(name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax amount is "+ tax);
		}
		else if(annual_salary >=300000) {
			tax= (annual_salary * 10) / 100;
			System.out.println(name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax amount is "+ tax);
		}
		else if(annual_salary >=200000) {
			tax= (annual_salary * 5) / 100;
			System.out.println(name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax is "+ tax);
		}
		else {
			//tax= (annual_salary * 15) / 100;
			System.out.println(name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and No Tax to pay");
		}

	}

}