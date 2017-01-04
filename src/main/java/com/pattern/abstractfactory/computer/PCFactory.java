package com.pattern.abstractfactory.computer;

public class PCFactory implements AbstractComputerFactory {
	
	private String HDD;
	private String RAM;
	private String CPU;
	
	public PCFactory(String hDD, String rAM, String cPU) {
		super();
		HDD = hDD;
		RAM = rAM;
		CPU = cPU;
	}

	@Override
	public Computer getComputer() {
		return new PC(HDD, CPU, RAM);
	}

}
