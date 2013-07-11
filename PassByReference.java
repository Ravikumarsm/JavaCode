package com.rOrg.mutableDemo;

public class PassByReference {
	public static void main(String[] args) {
		PassByReference pr=new PassByReference();
		MusicSystemMutable ms=new MusicSystemMutable("Creative",2500);
		System.out.println("the brand is "+ms.getBrand());
		System.out.println("the price of 1st music system "+ms.getPrice());
		pr.changeStates(ms);
		System.out.println("the brand is "+ms.getBrand());
		System.out.println("the price of 1st music system "+ms.getPrice());
	}
	public void changeStates(MusicSystemMutable ms){
		ms=new MusicSystemMutable("philips",2000);
	}

}
