package com.acat.jfx;

import org.apache.commons.text.StringEscapeUtils;

public class MMUnicodeFixer {
	
	public static String fix(String text) {
		if (text==null||text.isEmpty()) return null;
		
		//Escape \n in String
		String[] definitions = text.split("\n");
		
		StringBuilder sb = new StringBuilder();
		for (String out: definitions) {
			sb.append("\u200c");
			sb.append(StringEscapeUtils.escapeJson(out));
			sb.append("\n");
		}
		return StringEscapeUtils.unescapeJson(sb.toString());
	}
}