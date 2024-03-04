package com.naga.app;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo{

	public static void main(String[] args) {
		
//		Supplier<String> supplier=()->"Hi Java Techie";
//
//		System.out.println(supplier.get());
		
		List<String> list=Arrays.asList();
		System.out.println(list.stream().findAny().orElseGet(()->"Hi Java Techie no values in the list"));
		
	}
	



}
