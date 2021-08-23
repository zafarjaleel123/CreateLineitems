package com.Demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataDemo {

	public static void main(String[] args) {
		Scanner file;
        PrintWriter writer;
        try {
            file = new Scanner(new File("C:\\Users\\normal\\Desktop\\MaxorRecordCreation\\ClaimFile_5000_30record.txt")); //sourcefile
            writer = new PrintWriter("C:\\Users\\normal\\Desktop\\MaxorRecordCreation\\340229_DIED_ERX_ClaimFile_5000_30record.txt"); //destinationfile
            while (file.hasNext()) {
                String line = file.nextLine();
                if (!line.isEmpty()) {
                    writer.write(line);
                    writer.write("\n");
                }
            }
            file.close();
            writer.close();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(RemoveBlankLine.class.getName()).log(Level.SEVERE, null, ex);
        }
}
		 
	}

//}
