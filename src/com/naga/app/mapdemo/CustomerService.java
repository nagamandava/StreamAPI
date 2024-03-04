package com.naga.app.mapdemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerService {

	public static void main(String[] args) {

		List<Customer> allCustomers = MapDao.getAllCustomers();
//		map->it process stream of values and it does only mapping, so its oneto one mapping,this mapper function producess single value for the each single input
//		data transformation is stream to stream
		List<String> collectOfEmails = allCustomers.stream().map(customer->customer.getEmail()).collect(Collectors.toList());
		System.out.println(collectOfEmails);
		List<List<String>> collectOfPhoneNumbers = allCustomers.stream().map(customer->customer.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(collectOfPhoneNumbers);
//		flatMap()-> it process stream of stream of values, its one to many mapping and this mapper function producess multiple values for the each input value
//		it does both maping and data flattering,data transformation is stream<tream to stream
		List<String> collectAllPhoneNumbers = allCustomers.stream().flatMap(customer->customer.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(collectAllPhoneNumbers);
//		both map() and flatMap(0 are the intermediate methods
		
		Stream<String> map = allCustomers.stream().map(customer->customer.getEmail());
		
	}

}
