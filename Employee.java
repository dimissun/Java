import java.util.Scanner;

public class Employee {
	
	int id;
	String name;
	float sal;
	Scanner s1;
	
	public Employee(Scanner s1) {
		this.s1 = s1;
	}
	
	public void setEmpl() {
		System.out.println("Enter ID : ");
		id = s1.nextInt();
		
		s1.nextLine();

		System.out.println("Enter name : ");
		name = s1.nextLine();
		
		System.out.println("Enter Salary : ");
		sal = s1.nextFloat();
		
		}
	
	public void display() {
		
	System.out.println("ID = " +id);
	System.out.println("Name = " +name);
	System.out.println("Salary = " +sal);
	}


	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);

		Employee obj = new Employee(s1);

		obj.setEmpl();

		obj.display();

	}
}
