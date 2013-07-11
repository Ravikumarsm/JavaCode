package com.rOrg.immutableDemo;

public class PassByReferenceImmutable {
	public static void main(String[] args) {
		PassByValaueImmutable immutable=new PassByValaueImmutable();
		MusicystemImmutable ms=new MusicystemImmutable("Sony",4500);
		System.out.println("the brand is "+ms.getBrand());
		System.out.println("the price of 1st music system "+ms.getPrice());
		immutable.changeStates(ms);
		System.out.println("the brand is "+ms.getBrand());
		System.out.println("the price of 1st music system "+ms.getPrice());
	}
	public MusicystemImmutable changeStates(MusicystemImmutable ms){


		return new MusicystemImmutable("Creative",8000);

	}
}

