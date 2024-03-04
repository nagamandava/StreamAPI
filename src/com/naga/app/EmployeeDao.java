package com.naga.app;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

	public static List<Employee> getAllEmployees() {

		List<Employee> employeelist = new ArrayList();

		employeelist.add(new Employee(10, "sales", "naga", 100000));
		employeelist.add(new Employee(20, "finacial", "rama", 9000));
		employeelist.add(new Employee(21, "finacial", "rama", 8000));
		employeelist.add(new Employee(23, "finacial", "rama", 1000));
		employeelist.add(new Employee(19, "telecom", "siva", 700000));
		employeelist.add(new Employee(12, "banking", "kumari", 4002));

		return employeelist;

	}

}
