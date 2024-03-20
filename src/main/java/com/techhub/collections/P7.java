package com.techhub.collections;

import java.util.List;
import java.util.stream.Stream;

/**
 ==================================================================================================
 Program #7 Print the first name of employee
 --------------------------------------------------------------------------------------------------

 Ram
 Purshtom
 Diwaker
 Pawan
 Kuldeep
 Harish
 Shiv
 Naresh

 ==================================================================================================
 */
public class P7 {
	
	public static void main(String[] args) {
		List<Employee> employees = Employees.getAllEMPLOYEE_LIST();
		Stream<String> names= employees.stream().map(Employee::getFirstName);
		names.forEach(System.out::println);
	}
}
