package com.pojo_pom;

public class PojoB {
	
	public static void main(String[] args) {
	
		PojoA p=new PojoA();
		
		int a=p.getA();
		
		System.out.println("Get A: " +a);
		
		p.setA(100);
		
		int a2=p.getA();
		
		System.out.println("After Change:"+a2);
		
		
	}

}
