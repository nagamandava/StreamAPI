package com.naga.app;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {

	public static void main(String[] args) {
		
		List<Employee> allEmployees = EmployeeDao.getAllEmployees();
//		allEmployees.stream().filter(employee->employee.getSal()>4000).forEach(employee->System.out.println(employee));

		//print only fincial deprtemtn employee ?
		allEmployees.stream().filter(employee->employee.getDepartment().equalsIgnoreCase("finacial")).forEach(employee->System.out.println(employee));
		List<Employee> financialEmployees = allEmployees.stream().filter(employee->employee.getDepartment().equalsIgnoreCase("finacial")).collect(Collectors.toList());
		System.out.println(financialEmployees);
		Set<Employee> collect = allEmployees.stream().filter(employee->employee.getDepartment().equalsIgnoreCase("finacial")).collect(Collectors.toSet());
		System.out.println(collect);
		
		
		allEmployees.stream().filter(employee->employee.getDepartment().equalsIgnoreCase("finacial")).forEach(employee->System.out.println(employee));

		
	}
}
