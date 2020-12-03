package com.string;

public class String_Immutable {

	public static void main(String[] args) {
		
	String s=new String("Tamil");
	s.concat("english");
	System.out.println(s);
	
	StringBuffer sb=new StringBuffer("one");
	sb.append("two");
	System.out.println(sb);
	
	String s1=new String("kannan");
	String s2=new String("durga");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	
	
	
	}

}
