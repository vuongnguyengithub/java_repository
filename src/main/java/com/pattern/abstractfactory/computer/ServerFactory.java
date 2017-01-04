package com.pattern.abstractfactory.computer;

public class ServerFactory implements AbstractComputerFactory {
	private String RAM;
	private String CPU;
	private String HDD;

	public ServerFactory(String rAM, String cPU, String hDD) {
		super();
		RAM = rAM;
		CPU = cPU;
		HDD = hDD;
	}
	
	@Override
	public Computer getComputer() {
		return new Server(HDD, RAM, CPU);
	}
	
}
