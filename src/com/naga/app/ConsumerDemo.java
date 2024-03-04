package com.naga.app;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

//		Consumer<Integer> consumer =t -> System.out.println("printing:" + t);
//
//		consumer.accept(2);
		
		List<Integer> numberList=Arrays.asList(1,2,3,4,5);
          
		numberList.stream().forEach(i->System.out.println(i));
		
		List<String> nameList=Arrays.asList("naga","rama");
        
		nameList.stream().forEach(i->System.out.println(i));
	}

//	@Override
//	public void accept(Integer t) {
//		// TODO Auto-generated method stub
//		
//	}

}
