package io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		 File f= new File("c:\\classroom\\may14");
		 System.out.println(f.exists());
		 System.out.println(f.isDirectory());
	}

}
