package com.techhub.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 --------------------------------------------------------
 Program #3 Count the total of all employee salary.

 --------------------------------------------------------
 */
public class P3 {
	
	public static void main(String[] args) {
		List<Employee> employees = Employees.getAllEMPLOYEE_LIST();

		double totalSalary = totalOfAllSalary(employees);

		if(totalSalary == 285000){
			System.out.println("Passed : "+totalSalary);
		}else{
			System.out.println("Failed : "+totalSalary);
		}
	}
	
	private static double totalOfAllSalary(List<Employee> employees) {
		Stream<Employee> employeeStream = employees.stream();
		return employeeStream.mapToDouble(Employee::getSalary).sum();
	}
}
