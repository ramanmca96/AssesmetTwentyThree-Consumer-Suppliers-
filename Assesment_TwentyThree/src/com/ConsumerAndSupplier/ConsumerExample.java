package com.ConsumerAndSupplier;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String>Consumerinstance=(Company)-> System.out.println(Company);
		Consumer<Integer>ConsumerObj=(number)->System.out.println(number*6);
		ConsumerObj.accept(6);
		Consumerinstance.accept("Vee Technologies");
	}
}
