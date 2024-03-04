package com.naga.app.mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDao {

	public static List<Customer> getAllCustomers() {

		List<Customer> customerList = new ArrayList();

//		 Customer customer=new Customer(10, "Naga", "mandava.rky@gmail.com", Arrays.asList("12345897","12345678"));
		customerList.add(new Customer(10, "Naga", "naga.rky@gmail.com", Arrays.asList("12345897", "12345678")));
		customerList.add(new Customer(11, "Rama", "rama.rky@gmail.com", Arrays.asList("12305897", "1234000678")));
		customerList.add(new Customer(12, "lacky", "lacky.rky@gmail.com", Arrays.asList("1234954897", "189745678")));
		customerList
				.add(new Customer(13, "lakshmi", "lakshmi.rky@gmail.com", Arrays.asList("1201345897", "123451178")));

		return customerList;

	}

}
