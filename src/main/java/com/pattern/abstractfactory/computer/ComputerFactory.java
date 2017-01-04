package com.pattern.abstractfactory.computer;

public class ComputerFactory {
	public static Computer getComputer(AbstractComputerFactory abstractComputerFactory) {
		return abstractComputerFactory.getComputer();
	}
}
