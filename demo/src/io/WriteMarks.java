package io;

import java.io.RandomAccessFile;

public class WriteMarks {

	public static void main(String[] args) throws Exception {
		 
		RandomAccessFile raf = new RandomAccessFile("c:\\classroom\\may14\\marks.dat","rw");
		
		for (int i = 1; i <= 10; i ++) {
			int marks = (int) Math.round(Math.random() * 100);
			System.out.println(marks);
			raf.writeInt(marks);
		}
        raf.close(); 
	}

}
