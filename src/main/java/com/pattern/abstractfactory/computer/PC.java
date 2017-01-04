package com.pattern.abstractfactory.computer;

public class PC extends Computer {

	private String HDD;
	private String CPU;
	private String RAM;
	
	public PC(String hDD, String cPU, String rAM) {
		super();
		HDD = hDD;
		CPU = cPU;
		RAM = rAM;
	}

	@Override
	public String getHDD() {
		return HDD;
	}

	public void setHDD(String hDD) {
		HDD = hDD;
	}
	
	@Override
	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	@Override
	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

}
