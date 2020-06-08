//Question 1
package day9assesment;
import java.util.Scanner;

public class Greater {

	private int num1,num2,num3;
	
     Scanner scanner;
	
	Greater(){
		scanner  = new Scanner(System.in);
	}
	
	Greater(int num1,int num2,int num3) {
		scanner = new Scanner(System.in);
		this.num1 = num1;
		this.num2 =num2;
		this.num3 = num3;
		}
	
	

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	void getNumberFromUser() {
		System.out.println("please enter the First Number");
		num1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("please enter the Second Number");
		num2 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("please enter the Thrid Number");
		num3 = scanner.nextInt();
		
	}
	
	void printAccountDetails() {
		System.out.println("First Number"+num1);
		System.out.println("Second Number"+num2);
		System.out.println("Third Number"+num3);
		System.out.println("==============================");
						
}
	
	void getGreaterNumber() {
		if (num1>num2&&num1>num3)
			System.out.println("First Number is greater");
		else if(num2>num1&&num2>num3)
			System.out.println("Second Number is Greater");
		else if(num3>num1&&num3>num2)
			System.out.println("Third Number is Greater");
		else
			System.out.println("Enter the Valid NUmber");
				
	}
	
	
	public static void main(String[] args) {
		Greater grt =new Greater();
		grt.getNumberFromUser();
		grt.printAccountDetails();
		grt.getGreaterNumber();
	}

}
