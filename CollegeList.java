import java.util.Scanner;
public class CollegeList{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	Person person = new Person();
	Faculty faculty = new Faculty();
	Employee employee = new Employee();
	Student student = new Student();
	

	
	System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
	String select = sc.nextLine();
	
	switch(select.toUpperCase()){
		case "E":
			System.out.println("Type employee's name, contact number, salary, and department."); 
			System.out.println("Press Enter after every input.");
		    employee.setName(sc.nextLine());
	        employee.setContactNum(sc.nextLine());
	        employee.setSalary(sc.nextDouble());
			sc.nextLine();
	        employee.setDepartment(sc.nextLine());
	        System.out.println("----------------------------------------------------------------------------");
	        System.out.println("Name: " + employee.getName() + "\nContact Number: " +employee.getContactNum() +"\nSalary: " + employee.getSalary() + "\nDepartment: " +employee.getDepartment());
			break;
		case "F":

			System.out.println("Type faculty's name, contact number, salary, department, and status.");
			System.out.println("Press Enter after every input.");
			faculty.setName(sc.nextLine());
			faculty.setContactNum(sc.nextLine());
			faculty.setSalary(sc.nextDouble());
			sc.nextLine();
			faculty.setDepartment(sc.nextLine());

			System.out.print("Is the faculty regular?");
			System.out.println("Press Y for yes and N for no.");
			char regular = sc.next().charAt(0);
			if(regular == 'Y' || regular == 'y'){
				String displayStatus = faculty.isRegular(true) ? "Regular/tenured" : "Not Regular"; //true value Display Regular
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("Name: " + faculty.getName() + "\nContact Number: " +faculty.getContactNum() +"\nSalary: " + faculty.getSalary() + "\nDepartment: " +faculty.getDepartment() + "\nStatus: " + displayStatus);
			}else if(regular == 'N' || regular == 'n'){
				String displayStatus = faculty.isRegular(false) ? "Regular/tenured" : "Not Regular"; //False value display Not regular
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("Name: " + faculty.getName() + "\nContact Number: " +faculty.getContactNum() +"\nSalary: " + faculty.getSalary() + "\nDepartment: " +faculty.getDepartment() + "\nStatus: " + displayStatus);
			}
			break;
		case "S":
			System.out.println("Type student's name, contact number, program, and year level.");
			System.out.println("Press Enter after every input.");
			student.setName(sc.nextLine());
			student.setContactNum(sc.nextLine());
			student.setProgram(sc.nextLine());
			student.setYearLevel(sc.nextInt());
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("Name: " + student.getName() + "\nContact Number: " +student.getContactNum() +"\nProgram: " + student.getProgram() + "\nYear Level: " +student.getYearLevel());
			break;
		default:
			System.out.println("Invalid input.");
			break;
	}

	}
}