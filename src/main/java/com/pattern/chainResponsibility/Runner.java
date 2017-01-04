package com.pattern.chainResponsibility;

public class Runner {
	public static void main(String... strings) {
		AbstractLogger chainLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		chainLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
	
		chainLogger.logMessage(AbstractLogger.ERROR, "FUCK ");
	
		
	}
}
