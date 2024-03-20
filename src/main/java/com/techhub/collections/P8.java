package com.techhub.collections;

import java.util.List;
import java.util.stream.Stream;

/**
 ==================================================================================================
 Program #8 Print the full name of employee
 --------------------------------------------------------------------------------------------------

 Ram Niwash
 Purshtom Dass
 Diwaker Gupta
 Pawan Verma
 Kuldeep Singh
 Harish Kumar
 Shiv Kumar
 Naresh Kumar

 ==================================================================================================
 */
public class P8 {
	
	public static void main(String[] args) {
		List<Employee> employees = Employees.getAllEMPLOYEE_LIST();
		Stream<String> fullNames =  employees.stream().map(employee ->{
            return employee.getFirstName() +" "+employee.getLastName();
		});
		fullNames.forEach(System.out::println);
	}
}
