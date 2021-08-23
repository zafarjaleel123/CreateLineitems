package com.Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.selenium.Xls_Reader;

public class MaxorFileCreation {
	static String rxNum;
	static String rxDate;
	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\normal\\Desktop\\MaxorRecordCreation\\DEID_ERX_AmericanHC_20210426_340229_Claims.txt");
		
		BufferedReader read=new BufferedReader(new FileReader(file));
		String s="";
		String newsn="";
		String sn="";
		do {
			sn= sn + s + System.lineSeparator();
			s = read.readLine();
			}while(s!=null);
		String temp = sn;
		Xls_Reader reader=new Xls_Reader("C:\\Users\\normal\\Desktop\\MaxorRecordCreation\\dataforcreation.xlsx");
		Map<String,String> wordToReplace=new HashMap<String,String>();
		FileWriter writer =new FileWriter("C:\\Users\\normal\\Desktop\\MaxorRecordCreation\\ClaimFile_5000_30record.txt",true);
		for(int i=2;i<reader.getRowCount("sheet1");i++) {
			sn = temp;
			rxNum=reader.getCellData("Sheet1", "Rxnumber", i);
			rxDate=reader.getCellData("Sheet1", "RxDate", i);
			String rxnumber=rxNum.substring(0,rxNum.indexOf("."));
			int val = new BigDecimal(rxDate).intValue();
			String rxnewdate=String.valueOf(val);
			System.out.println(rxnumber+" "+val);
			
			wordToReplace.put("sample", rxnumber);
			wordToReplace.put("examples", rxnewdate);
			Set<String> keys=wordToReplace.keySet();
			for(String key:keys) {
				newsn=sn.replaceAll(key, wordToReplace.get(key));
				System.out.println("Key ="+key+" Value ="+wordToReplace.get(key));
				sn=newsn;
			}
			writer.append(newsn);
		}
		read.close();
		writer.close();
	}

}
