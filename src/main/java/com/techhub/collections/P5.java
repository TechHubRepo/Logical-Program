package com.techhub.collections;

import java.util.List;
import java.util.stream.Stream;

/**
 --------------------------------------------------------------
 Program #5 Show the details of employee who are from Bangalore

 --------------------------------------------------------------
 */
public class P5 {
	
	public static void main(String[] args) {
		List<Employee> employees = Employees.getAllEMPLOYEE_LIST();
		show(employees);
	}
	
	private static void show(List<Employee> employees) {
		Stream<Employee> employeeStream = employees.stream();
		employeeStream.filter(e->{
			return e.getCity().equals("Bangalore");
		}).forEach(System.out::println);
	}
}
