package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;

public class SortWords {

	public static void main(String[] args) throws Exception {
		 
		var br = Files.newBufferedReader(Path.of("c:\\classroom\\old_man.txt"));
		var uniqueWords = new TreeSet<String>();
		
		while(true)
		{
			String line = br.readLine();
			if (line == null)
				break;
			
			var words = line.split("\\W+"); //  \W means non-word char
			uniqueWords.addAll(Arrays.asList(words));
		}
		
		br.close();
		
		for(String word : uniqueWords)
			System.out.println(word);
	}
}
