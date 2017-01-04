package com.pattern.proxy;

public class RealImage implements Image{
	
	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		this.loadFromDisk(this.fileName);
	}
	
	
	@Override
	public void display() {
		System.out.println("Display real image!");
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Load from " + fileName);
	}
}
