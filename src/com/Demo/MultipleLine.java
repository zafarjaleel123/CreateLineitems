package com.Demo;

//import java.io.BufferedReader;
/*import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;*/
import java.io.*;
import java.util.*;
/*import java.util.HashMap;
import java.util.Map;*/

public class MultipleLine {
	
	public static void main(String[] args) throws IOException {

		Map<String,String> wordToReplace=new HashMap<String,String>();
		wordToReplace.put("JSON", ".net");
		wordToReplace.put("W3Schools", "prime");
		File file=new File("C:\\Users\\normal\\Desktop\\demo.txt");
		BufferedReader read=new BufferedReader(new FileReader(file));
		
		//String oldcontent="";
		String sn="";
		String s=read.readLine();
		String n1ew="";
		while(s!=null) {
			sn= sn + s + System.lineSeparator();
			s = read.readLine();
			//System.out.println(s);
		}	
		
		//String newContent = sn.replaceAll("JSON", "Zafar");
		Set<String> keys=wordToReplace.keySet();
		for(String key:keys) {
			sn=sn.replace(key, wordToReplace.get(key));
		}
		FileWriter writer =new FileWriter("C:\\Users\\normal\\Desktop\\demo.txt",true);
		writer.write(sn);
		//writer.write(n1ew);
		//writer.write(newContent);
		read.close();
		writer.close();
		//System.out.println(line);
		
		

	}

}
