package com.Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MultipleLine3 {

	public static void main(String[] args) throws IOException {
		String sn="";
		
		File file=new File("C:\\Users\\normal\\Desktop\\demo.txt");
		BufferedReader read=new BufferedReader(new FileReader(file));
		
		String s=read.readLine();
		
		while(s!=null) {
			sn= sn + s + System.lineSeparator();
			s = read.readLine();
			//System.out.println(s);
		}	
		//String newContent = sn.replaceAll("channel", "Keyboard1");
		//String newContent = sn.replaceAll("JSON", "XML");
		String newContent = sn.replaceAll("7306", "items");
		
		FileWriter writer =new FileWriter("C:\\Users\\normal\\Desktop\\demo.txt",true);
		writer.write(newContent);
		
		read.close();
		writer.close();
	}
	

}
