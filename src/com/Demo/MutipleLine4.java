package com.Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.selenium.Xls_Reader;

public class MutipleLine4 {
	static String desciption="";
	static String desciptionid1;
	static String desciptionid2;
	static String lineno;
	static String orderId;
	//static String taxLineId;
	public static void main(String[] args) throws Exception {
		
		File file=new File("C:\\Users\\normal\\Desktop\\Python\\newline.txt");
		BufferedReader read=new BufferedReader(new FileReader(file));	
		String newsn="";
		String sn="";
		String s="";
		do {
			sn= sn + s + System.lineSeparator();
			s = read.readLine();
		}while(s!=null);
		String temp = sn;
		Xls_Reader reader=new Xls_Reader("C:\\Users\\normal\\Desktop\\HeaderLevel.xlsx");
		Map<String,String> wordToReplace=new HashMap<String,String>();
		FileWriter writer =new FileWriter("C:\\Users\\normal\\Desktop\\demo2.txt",true);
		
		for(int i=2;i<reader.getRowCount("sheet1");i++) {
			sn = temp;
			desciption=reader.getCellData("Sheet1", "Description name", i);
			desciptionid1=reader.getCellData("Sheet1", "Description_ID_1", i);
			desciptionid2=reader.getCellData("Sheet1", "Description_ID_2", i);
			lineno=reader.getCellData("Sheet1", "linenumber", i);
			orderId=reader.getCellData("Sheet1", "orderid", i);
			//taxLineId=reader.getCellData("Sheet1", "taxlineid", i);
			
			
			System.out.println(desciption+","+desciptionid1+","+desciptionid2+","+lineno+","+orderId);
			
			String desId1=desciptionid1.substring(0,desciptionid1.indexOf("."));
			String desId2=desciptionid2.substring(0,desciptionid2.indexOf("."));
			String ln=lineno.substring(0,lineno.indexOf("."));
			String ordId=orderId.substring(0,orderId.indexOf("."));
			//String tacId=taxLineId.substring(0,taxLineId.indexOf("."));
			
			wordToReplace.put("Discriptionname", desciption);
			wordToReplace.put("DescritionID_1", desId1);
			wordToReplace.put("DescritionID_2", desId2);
			wordToReplace.put("line_number", ln);
			wordToReplace.put("order_number",ordId );
			//wordToReplace.put("taxline_id",tacId );
			
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
