package com.naga.app;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	void m1();

//	void m2(); it can have only one SAM
	
	default void m3() {
		System.out.println("Defaultmethod1");
	}
	
	default void m4() {
		System.out.println("Defaultmethod1");
	}
	default void m5() {
		System.out.println("Defaultmethod1");
	}
	static void m6() {
		System.out.println("Defaultmethod1");
	}
}
