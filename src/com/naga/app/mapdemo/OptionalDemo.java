package com.naga.app.mapdemo;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Customer customer = new Customer(10, "Naga", null, Arrays.asList("12345897", "12345678"));

//		empty
//		of
//		ofNullable

		Optional<Object> emptyOptional = Optional.empty();// by using this we can create a empty optional object
		System.out.println(emptyOptional);

//		Optional<String> ofEnail = Optional.of(customer.getEmail());//by using this this we can create optional object but if value is null it will throw the NPE, to avoid this we can go for ofNullable
//		System.out.println(ofEnail);

		Optional<String> ofNullableEmail = Optional.ofNullable(customer.getEmail());// by using this if the object is
																			// null it will retuen a an empty
																					// pbject instead of NPE
//		if (ofNullableEmail.isPresent())
//			System.out.println(ofNullableEmail.get());
		
//		String orElse = ofNullableEmail.orElse("emil@test.com");
		String orElseThrow = ofNullableEmail.orElseThrow(()->new IllegalArgumentException("email is not present"));
		System.out.println(orElseThrow);

	}

}
