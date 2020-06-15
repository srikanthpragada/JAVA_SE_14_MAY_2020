package coll;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class SortCustomers {

	public static void main(String[] args) throws Exception {
		 
		var lines = Files.readAllLines(Path.of("c:\\classroom\\may14\\customers.txt"));
		
		var customers = new TreeMap<String,String>();
		
		for (String line : lines)
		{
			var parts = line.split(",");
			if (parts.length > 1)
			    customers.put(parts[0],parts[1]);
			else
				customers.put(parts[0],"Unknown");
		}
		
		for(String name : customers.keySet())
			System.out.printf("%-20s  %s\n",  name, customers.get(name));
		
	}

}
