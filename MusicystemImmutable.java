package com.rOrg.immutableDemo;

public class MusicystemImmutable {
	private String brand;
	private double price;
	public MusicystemImmutable(String brand,double price) {
		this.brand=brand;
		this.price=price;

	}
	public String getBrand() {
		return brand;
	}
	public double getPrice() {
		return price;
	}
}