package io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintWords {

	public static void main(String[] args) throws Exception {
		var content = Files.readString(Path.of("c:\\classroom\\old_man.txt"));
		Pattern p = Pattern.compile("\\s+");  
		Matcher m = p.matcher(content);

		var result = m.replaceAll("\n");
		System.out.println(result);
	}
}
