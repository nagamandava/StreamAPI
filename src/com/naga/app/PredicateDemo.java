package com.naga.app;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate = t -> t % 2 == 0;
//		System.out.println(predicate.test(8));

		List<Integer> conditionList = Arrays.asList(33, 47, 88, 97, 435, 600);

//		conditionList.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print the enen numbers:" + t));

		List<String> conditionListOfNames = Arrays.asList("1Naga2","Rama2","Naga2");

		conditionListOfNames.stream().filter(name->name.endsWith("a")).forEach(t -> System.out.println("print the enen numbers:" + t));

	}

}
