package com.techhub.collections;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 ==================================================================================================
 Program #4 Show highest and second-highest salary of employee.
 --------------------------------------------------------------------------------------------------
 90000
 60000
 ==================================================================================================
 */
public class P4 {
	
	public static void main(String[] args) {
		List<Employee> employees = Employees.getAllEMPLOYEE_LIST();
		show(employees);
	}
	
	private static void show(List<Employee> employees) {
		Stream<Employee> employeeStream = employees.stream();
		double[] arr=employeeStream.mapToDouble(Employee::getSalary).sorted().toArray();
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[arr.length-2]);
	}
}
