package com.ConsumerAndSupplier;

import java.util.function.Supplier;

public class SuppliersExample {

	public static void main(String[] args) {
		
		Supplier<String>SupplierInstance=()->{
			String EmpId="";
			
			for(int i=0;i<5;i++)
			{
				EmpId=EmpId+ (int) (Math.random()*10);
			}
			return EmpId;
		};
		
		String string = SupplierInstance.get();
		System.out.println(string);
	} 	
}
