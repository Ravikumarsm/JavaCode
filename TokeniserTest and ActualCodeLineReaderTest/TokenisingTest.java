package com.app;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TokenisingTest {
	
	
	public static void main(String[] args) throws Exception {
		boolean isCommentLineEncountered=false;
		String filename="D:\\IOTest.java";
		Pattern patternForStringLiteral = Pattern.compile("[\"].*[\"]");
		Pattern patternForFindingDigits = Pattern.compile("[\\d]{1,}[.]*[\\d]*");
		String[] operatorMapper = {"/","%","*","++","<=","==","!=","=","+","-","&&","||","?:","~","--","!",">",">=","<","<<",">>",">>>","&","^","|"};
		String[] keywordMapper = {"for","abstract","new","switch","assert","package","synchronized","boolean","break","byte","case","catch","char","class","native","continue","default","do","if","double","else","enum","extends","final","finally","float","private","implements","import","instanceof","int","short","interface","long","super","this","protected","public","return","try","static","strictfp","while","throw","throws","transient","void","volatile"};
		List<String> operatorMappingList= Arrays.asList(operatorMapper);
		List<String> keywordMappingList = Arrays.asList(keywordMapper);
		LineNumberReader reader  = new LineNumberReader(new FileReader(filename));
		String lineRead = "";
		while ((lineRead = reader.readLine()) != null) {
			if(lineRead.matches("/\\*")){
				isCommentLineEncountered=true;
			}
			if(isCommentLineEncountered){
				System.out.println(lineRead+" comment line at "+reader.getLineNumber());
				if(lineRead.matches("\\*/"))
					isCommentLineEncountered=false;
			}else{
				Matcher matcherForStringLiteral = patternForStringLiteral.matcher(lineRead);
				if(matcherForStringLiteral.find()){
					System.out.println(matcherForStringLiteral.group()+" string literal found at "+reader.getLineNumber());
					lineRead=lineRead.replaceAll("[\"].*[\"]", "");
				}
				StringTokenizer tokenizer = new StringTokenizer(lineRead);
				while(tokenizer.hasMoreTokens()){
					String nextToken = tokenizer.nextToken();
					if(operatorMappingList.contains(nextToken)){
						System.out.println("operator "+nextToken+" found at "+reader.getLineNumber());
						lineRead=lineRead.replaceFirst(nextToken, "");
					}else if(keywordMappingList.contains(nextToken)){
						System.out.println("keyword "+nextToken+" found at "+reader.getLineNumber());
						lineRead=lineRead.replaceFirst(nextToken, "");
					}
				}
				StringTokenizer tokenizerWithoutKeywordAndOperator = new StringTokenizer(lineRead);
				while(tokenizerWithoutKeywordAndOperator.hasMoreTokens()){
					String nextToken = tokenizerWithoutKeywordAndOperator.nextToken();
					Matcher matcherForDigit = patternForFindingDigits.matcher(nextToken);
					if(matcherForDigit.find()){
						System.out.println("digit found at "+matcherForDigit.group()+" at "+reader.getLineNumber());
						lineRead=lineRead.replaceFirst(matcherForDigit.group(), "");
					}
					if(lineRead.trim().length()>0){
						System.out.println("symbol "+nextToken+reader.getLineNumber());
					}
				}
			
			}
			
		}

		
		reader.close();
	}

}
