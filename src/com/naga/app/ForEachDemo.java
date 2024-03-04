package com.naga.app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("naga", "Rama", "Sivakumari");

//		for (String name : list) {
//			if (name.endsWith("i")) {
//				System.out.println(name);
//			}
//		}


		list.stream().filter(name->name.endsWith("i")).forEach(name -> System.out.println(name));

		Map<Integer, String> dummeyMap = new HashMap<Integer, String>();
		dummeyMap.put(1, "Java");
		dummeyMap.put(2, "c");
		dummeyMap.put(3, "angular");
		dummeyMap.put(4, "aws");

//		dummeyMap.forEach((key, value) -> System.out.println(key + ":" + value));
		dummeyMap.entrySet().stream().filter(n->n.getKey()%2==0).forEach(obj -> System.out.println(obj));

	}

}
