package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class WordsFreq {

	public static void main(String[] args) throws Exception {

		var contents = Files.readString(Path.of("c:\\classroom\\old_man.txt"));
		var words = contents.split("\\W+");
		var freq = new TreeMap<String, Integer>();

		for (String word : words) {
			if (freq.containsKey(word)) // word is already present then increment count
			{
				var count = freq.get(word);
				freq.put(word, count + 1);
			} else
				freq.put(word, 1); // Add a new word with count 1
		}
		
		for (String word : freq.keySet())
			System.out.printf("%-20s  %3d\n", word, freq.get(word));
	}
}
