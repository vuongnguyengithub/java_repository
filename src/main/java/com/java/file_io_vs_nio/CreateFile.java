package com.java.file_io_vs_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CreateFile {
	public static void main(String... strings) {
		Path path = Paths.get("D:\\test\\test\\test.txt");
		log(path);

	}

	private static void log(Path path) {
		String helloWorld = "Hello world!" + System.currentTimeMillis() + "\n";
		if (!Files.exists(path)) {
			try {
				Files.createFile(path);
			} catch (IOException e) {
			}
		}
		try {
			Files.write(path, helloWorld.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
		}
	}
}
