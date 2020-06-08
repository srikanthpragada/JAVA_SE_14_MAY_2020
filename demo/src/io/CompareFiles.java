package io;

import java.io.FileReader;

public class CompareFiles {

	public static void main(String[] args) throws Exception {
		 FileReader fr1 = new FileReader("c:\\classroom\\may14\\file1.txt");
		 FileReader fr2 = new FileReader("c:\\classroom\\may14\\file2.txt");
		 int line = 1, col = 1,ch1,ch2;
		 
		 while(true)
		 {
             ch1 = fr1.read();
             ch2 = fr2.read();
             
             if (ch1 != ch2)
             {
            	 System.out.printf("Differed at %d,%d\n",line,col);
            	 break;
             }
             
             if(ch1 == -1) // EOF
             {
            	 System.out.println("File are equals!");
            	 break;
             }
             
             if (ch1 == 10) // new line
             {
            	  line ++;
            	  col = 1;
             }
             else
            	  col ++;
		 }
	}

}
