/**
 * 
 */
package com.kpjavaspringmvc.mysql;

import java.io.*;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import java.time.LocalDateTime;
import java.util.*;
import java.util.Properties;



/**
 * @author 	Kailash Pasumarthy
 * 			KP : Config class to read the config file settings
 *
 */
public class Config {
	
	
	////KP : Debug Print on Console & Output File
	private String outPrintLn = "KP : KPJavaWebApp Config Code : Entering Config()...\n";
	private String outFilePath = new String("C:/Users/admin/eclipse-workspace/KPJavaWebApp/src/com/kpjavapackage/KPJavaWebAppDebug.txt");
	private FileWriter fout = null;
	//String debugFilePath = ("C:/Users/admin/eclipse-workspace/KPJavaWebApp/src/com/kpjavapackage");
    private FileOutputStream fos = null;
    private File file = new File(outFilePath);		//file;
 	
    
	/**
	 * Config Class Constructor
	 */
	public Config() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * KP : FilesBufferWrite2Append : outPrintLn
	 */
    public void FilesBufferWrite2Append() throws IOException {
    	try {    	
    		
 	       	/* This logic will check whether the file
  	  	   	 * exists or not. If the file is not found
  	  	   	 * at the specified location it would create
  	  	   	 * a new file*/
  	  	  	if (!file.exists()) {
  	  		  file.createNewFile();
  	  	  	}
    		
  	  	  	//KP : java.nio.file.Files.write - NIO is buffer oriented & IO is stream oriented!]
    		String str2Write = "\n" + LocalDateTime.now().toString() + "\t" + outPrintLn + "\n";
    		Files.write(Paths.get(outFilePath), str2Write.getBytes(), StandardOpenOption.APPEND);
    		
    	}catch (IOException e) {
	    	// TODO Auto-generated catch block
	    	e.printStackTrace();		
			System.out.print(outPrintLn);
			System.out.println(outPrintLn);	
    	}
    }
    
	

}
