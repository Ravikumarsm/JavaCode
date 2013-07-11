package com.rOrg.mutableDemo;

public class PassByValue {
	public static void main(String[] args) {
		PassByValue pass=new PassByValue();
		MusicSystemMutable ms= new MusicSystemMutable("Sony",5000);
		System.out.println("the brand is "+ms.getBrand());
		System.out.println("the price of 1st music system "+ms.getPrice());
		pass.changeStates(ms);
		System.out.println("the brand is "+ms.getBrand());
		System.out.println("the price of 1st music system "+ms.getPrice());
	}
	public void changeStates(MusicSystemMutable ms){
		ms.setBrand("Samsung");
		ms.setPrice(4000);
	}
}
