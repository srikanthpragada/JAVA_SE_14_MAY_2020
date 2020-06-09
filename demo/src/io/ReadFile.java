package io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		 Path file = Paths.get("c:\\classroom\\may14\\Hello.java");
		 //System.out.println(file.getClass());
		 System.out.println(Files.readString(file));

	}

}
