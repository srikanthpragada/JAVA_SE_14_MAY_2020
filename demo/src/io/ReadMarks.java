package io;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class ReadMarks {

	public static void main(String[] args) throws Exception {

		RandomAccessFile raf = new RandomAccessFile("c:\\classroom\\may14\\marks.dat", "r");
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("Enter rollno [1-10, 0 to stop] :");
			int rollno = s.nextInt();
			if (rollno == 0)
				break;
			try {
				raf.seek((rollno - 1) * 4);
				System.out.printf("Marks : %d\n", raf.readInt());
			} catch (Exception ex) {
				System.out.println("Sorry! Could not read marks!");
			}
		}
		raf.close();
	}

}
