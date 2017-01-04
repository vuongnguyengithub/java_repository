package com.java.file_io_vs_nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class FileController {

	public static void main(String... strings) throws IOException, URISyntaxException {
		/*String uri = "D:\\test.txt";
		FileController.readFiles(uri);

		String writeUri = "D:\\testWriting.txt";
		String content = "This is testing \n This is second line.";
		// FileController.writeFiles(writeUri, content.getBytes("UTF-8"));
		content = "zzzzzzzzzzzzzzzzz";
		FileController.writeFileByBuffer(writeUri, content.getBytes());

		FileController.writeFileToFile(writeUri, "D:\\test2.txt");
		FileController.copyFilesByBuffer(uri, "D:\\test3.txt");*/
		
		Path path = Paths.get("D:\\test11.txt");
		System.out.println(Files.exists(path,LinkOption.NOFOLLOW_LINKS));
	}

	public static void writeFiles(String uri, byte[] content) {

		try {
			Path path = new File(uri).toPath();
			Files.write(path, content, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (IOException ex) {

		} finally {

		}

	}

	public static void copyFilesByBuffer(String fromFile, String toFile) {
		try {
			
			FileChannel in = new FileInputStream(fromFile).getChannel();
			FileChannel out = new FileOutputStream(toFile).getChannel();
			
			ByteBuffer buffer = ByteBuffer.allocate(48);
			while (in.read(buffer) > 0) {
				buffer.flip();
				out.write(buffer);
				buffer.clear();
			}
		} catch (Exception ex) {

		}
	}

	public static void writeFileToFile(String fromFile, String toFile) {
		try {
			File fFile = new File(fromFile);
			File tFile = new File(toFile);
			FileInputStream fileInputStream = new FileInputStream(fFile);
			Files.copy(fileInputStream, tFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
		}

	}

	public static void writeFileByBuffer(String uri, byte[] content) {
		try {
			File file = new File(uri);
			if (file.exists()) {
				Files.deleteIfExists(file.toPath());
				Thread.sleep(10000);
			}

			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(content);
			FileChannel out = fileOutputStream.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(100000);
			while (out.read(buffer) != -1) {
				buffer.flip();
				out.write(buffer);
				buffer.clear();
			}

			out.close();
			fileOutputStream.close();
		} catch (Exception ex) {

		}
	}

	public static void readFiles(String uri) throws IOException, URISyntaxException {

		Path path = new File(uri).toPath();

		if (!Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
			throw new NoSuchFileException("There is no file with path " + uri);
		}
		RandomAccessFile randomAccessFile = new RandomAccessFile(uri, "rw");
		FileChannel inChannel = randomAccessFile.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(48);
		int bytesRead = inChannel.read(buffer);
		while (bytesRead != -1) {
			buffer.flip();
			while (buffer.hasRemaining()) {
				System.out.print((char) buffer.get());
			}

			buffer.clear();
			bytesRead = inChannel.read(buffer);
		}
		randomAccessFile.close();
	}

}
