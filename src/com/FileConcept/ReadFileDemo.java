package com.FileConcept;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\normal\\Desktop\\New Text Document (2).txt");
		BufferedReader read=new BufferedReader(new FileReader(file));
		
		String oldcontent="";
		String line=read.readLine();
		while(line!=null) {
			oldcontent = oldcontent + line + System.lineSeparator();
			line = read.readLine();
		}
		String newContent = oldcontent.replaceAll("vertexinc.com", "ui");
		FileWriter writer =new FileWriter("C:\\Users\\normal\\Desktop\\New Text Document (3).txt");
		writer.write(newContent);
		read.close();
        
        writer.close();

	}

}
