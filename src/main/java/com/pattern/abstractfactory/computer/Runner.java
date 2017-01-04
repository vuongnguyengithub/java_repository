package com.pattern.abstractfactory.computer;

public class Runner {

	/**
	 * PROPLEM?
	 * <p>Shift the responsibility to the client.
	 * <p>The client have to do this
	 * <pre>	
	 * switch(computerType) {
	 * case SERVER:
	 * return new ServerFactory(...);
	 * 	
	 * case PC:
	 * return new PCFactory(...);
	 * 
	 * default:
	 * return null;
	 * }
	 * </pre>
	 * <p> This is not one of the purposes of abstract factory - hide the complexity for the client
	 * @param strings
	 */
	public static void main(String... strings) {
		PCFactory pcFactory = new PCFactory("PC-HDD", "PC-RAM", "PC-CPD");
		Computer pc = ComputerFactory.getComputer(pcFactory);
		System.out.println(pc);
		
		ServerFactory serverFactory = new ServerFactory("S-RAM", "S-CPU", "S-HDD");
		Computer server = ComputerFactory.getComputer(serverFactory);
		System.out.println(server);
		
		/*
		ComputerFactory pcFactory = ComputerFactoryProducer.getFactory(ComputerType.PC);
		Computer pc = pcFactory.getComputer("RAM", "CPU", "HDD");
		
		ComputerFactory serverFactory = ComputerFactoryProducer.getFactory(ComputerType.SERVER);
		Computer server = serverFactory.getComputer("RAM", "CPU", "HDD");
		*/
	}
}
