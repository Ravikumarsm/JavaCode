package com.app;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;
public class CommentLineReaderTest {
	public static void main(String[] args) throws Exception
	{
	String filename = "D://IOTest.java";
	String code = new Scanner(new File(filename)).useDelimiter("\\A").next();
	code = Pattern.compile("/\\*.*?\\*/|//.*?$", Pattern.MULTILINE | Pattern.DOTALL).matcher(code).replaceAll("");
	String[] s = Pattern.compile("\\S.*?$", Pattern.MULTILINE).split(code.trim());
	System.out.println("Total number of line of Code "+s.length);
	}
	} 

