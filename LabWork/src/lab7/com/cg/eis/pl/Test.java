package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.*;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Test {

	static Scanner sc;
	EmployeeService empService;

	public Test() {
		empService = new Service();
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		Test obj = new Test();

		while(true) {
			System.out.println("=============MENU============\n"
					+ "1.Add Employee to DataBase\n"
					+ "2.Display All Employees in DataBase\n"
					+ "3.Display Employee in Salary Range\n"
					+ "4.Display Employee by ID\n"
					+ "5.Show All Employee Schemes\n"
					+ "6.Delete Employee By ID\n"+"0.Exit App\n"
					+ "==============================\n"
					+ "Please enter the query number : ");


			int n = Integer.parseInt(sc.nextLine());
			switch(n) {
					case 0: System.exit(0);
					break;
			
					case 1: obj.insertEmployeeInforamtion();
					break;
			
					case 2: obj.displayAllEmployee();
					break;
			
					case 3: obj.displaySalaryRangeEmployee();
					break;
			
					case 4: obj.getEmployeeById();
					break;
			
					case 5: obj.getAllEmployeeByScheme();
					break;
			
					case 6: obj.deleteEmployee();
					break;
			}
		}

	}



	public void insertEmployeeInforamtion() 
	{
		System.out.println(" \n========= Enter Employee Information to insert in the DataBase =========\n");

		System.out.println("NAME: ");
		String empName = sc.nextLine();

		System.out.println("ID: ");
		int id = Integer.parseInt(sc.nextLine());

		System.out.println("SALARY: ");
		int salary = Integer.parseInt(sc.nextLine());

		Employee e = new Employee(empName, id, salary);

		try {
			boolean isInserted = empService.insertEmployee(e);
		}
		catch(Exception excep)
		{

			System.out.println("Contact HR "+excep);
		}


	}

	public void displayAllEmployee() {
		System.out.println("\n=========== Employees Information ===========\n");
		Collection<Employee> empList = empService.getAllEmployees();

		for (Employee employee : empList) {
			displayEmployee(employee);
		}
	}


	private void displaySalaryRangeEmployee() {
		System.out.println("Enter Salary Range :");
		int l = Integer.parseInt(sc.nextLine());
		int u = Integer.parseInt(sc.nextLine());
		System.out.println("\n=========== Employees Information in Salary Range ===========\n");
		Collection<Employee> empList = empService.getAllEmployees();

		for (Employee employee : empList) {
			if(employee.getSalary() > l && employee.getSalary() < u) {
				displayEmployee(employee);
			}
		}
	}

	public void getEmployeeById() {
		System.out.println("Enter the Id: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("\n=========== Employees Information by ID Number ===========\n");
		Collection<Employee> empList = empService.getAllEmployees();
		int f=0;
		for (Employee employee : empList) {
			if(employee.getId() == id ) {
				f=1;
				displayEmployee(employee);
			}
		}
		if(f==0) System.out.println("Employee ID not found!");

	}


	public void deleteEmployee() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Id to delete: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("\n===========  Employees Information after deleting wrt ID Number ===========\n");
		List<Employee> empList = empService.deleteEmployee(id);

		for (Employee employee : empList) {
			displayEmployee(employee);
		}
	}

	public void getAllEmployeeByScheme() {
		System.out.println("\n=========== Employees Insurance Information ===========\n");
		Collection<Employee> empList = empService.getAllEmployees();

		for (Employee e : empList) {
			System.out.println("\n\n");
			System.out.println(" Name 		 	: "+e.getEmpName());
			System.out.println(" ID   		 	: "+e.getId());
			System.out.println(" Salary      	: "+e.getSalary());
			System.out.println(" Designation 	:  "+e.getDesignation());
			System.out.println(" InsuranceScheme: "+e.getInsuranceScheme());
			System.out.println("\n\n");
		}
	}

	public void displayEmployee(Employee e)
	{
		System.out.println("\n ===========Employee Details=========\n");
		System.out.println(" NAME	: "+e.getEmpName());
		System.out.println(" ID   	: "+e.getId());
		System.out.println(" SALARY : "+e.getSalary());
		System.out.println("\n=====================================\n");
	}
}