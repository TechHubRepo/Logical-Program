package com.techhub.collections;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 ==================================================================================================
 Program #15

 Count employee by the city using java 8 stream api
 ==================================================================================================
 */
public class P15 {

    public static void main(String[] args) {

		List<Employee> employees = Employees.getAllEMPLOYEE_LIST();

		Map<String,Long> empCountByCity = employees.stream()
				.collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));

		System.out.println(empCountByCity);

	}
}