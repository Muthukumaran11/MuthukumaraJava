package day12assignment;

import java.util.Scanner;
interface CustomerManager{
void solveIssues();
void approveLoan();
public static void customermanagerMethod() {
		System.out.println("This is in the customer interface--satatic method");
	}
}
interface EmployeeManager{
	 void conductMeeting();
	 void setTarget();
	 public static void employeemanagerMethod() {
			System.out.println("This is in the employee interface--satatic method");
		}
}

abstract class Employee{
	int id;
	String name,phone,designation;
	float salary;
	Scanner scanner;
	
	{
	scanner = new Scanner(System.in);
	}
	abstract void EmployeeDetails();
	//abstract void customerDetails();
}

class Manager extends Employee implements CustomerManager,EmployeeManager {


	@Override
	public void conductMeeting() {
		// TODO Auto-generated method stub
		System.out.println("Weekly Meeting every Monday");
		System.out.println("-------------------------------------------");		
		}

	@Override
	public void setTarget() {
		// TODO Auto-generated method stub
		System.out.println("Employee need to achieve 30 open savings account evrey month");
		System.out.println("-------------------------------------------");
		}

	@Override
	public void solveIssues() {
		// TODO Auto-generated method stub
		System.out.println("Attention Customers form Manager");
		System.out.println("Hi Customer, Please contact enquirt dept for issues");
		System.out.println("-------------------------------------------");
	}

	@Override
	public void approveLoan() {
		// TODO Auto-generated method stub
		System.out.println("Dear customer,Loan Approved");
		System.out.println("---------------------------------------------------------------------");
		
	}

	@Override
	void EmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("EMPLOYEE DESIGNATION ");
		System.out.println("----------------------------------");
		System.out.println("enter the Employee id ");
		id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("enter the Employee name ");
		name=scanner.nextLine();
		System.out.println("enter the Employee phone ");
		phone=scanner.nextLine();
		System.out.println("enter the Employee salary ");
		salary=scanner.nextFloat();
		scanner.nextLine();
		System.out.println("enter the Employee designation ");
		designation=scanner.nextLine();
		System.out.println("These are the Employee Designation.");
System.out.println("---------------------------------------");
		
		
		
	}

	}
public class Office{
	public static void main(String[] args) {
		Manager manager = new Manager();
		
	CustomerManager CustomerManagerObject;
		CustomerManagerObject=manager;
		CustomerManagerObject.solveIssues();
		CustomerManagerObject.approveLoan();
		
		EmployeeManager EmployeeManagerObject;
		EmployeeManagerObject=manager;
		manager.EmployeeDetails();
		EmployeeManagerObject.conductMeeting();
		EmployeeManagerObject.setTarget();
	}
}