package com.techhub.collections;

import java.util.Comparator;
import java.util.List;

/**
 ==================================================================================================
 Program #13

 Print the 3 employee details of highest salary
 ==================================================================================================
 */
public class P12 {

	public static void main(String[] args) {
		List<Employee> list = Employees.getAllEMPLOYEE_LIST();
		showHigherSalariedEmployee(list);
	}

	public static void showHigherSalariedEmployee(List<Employee> employees) {
		employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).forEach(e->{
			System.out.println("NAME : "+e.getFirstName()+"; Salary : "+e.getSalary());
		});
	}
}