package stringmethods;

import java.util.Arrays;

public class Methodofstring {
public static void main(String[] args) {
	                           
	                           //searching method of string
/*	String a="sonawane";
	System.out.println(a.length());
	System.out.println(a.isEmpty());
	System.out.println(a.indexOf("n"));
	System.out.println(a.lastIndexOf("n"));
	System.out.println(a.charAt(5));
	System.out.println(a.contains("w"));   //agar word he to true nahi hai to false
	System.out.println(a.contains("z"));
	System.out.println(a.startsWith("s"));
	System.out.println(a.startsWith("so"));
	System.out.println(a.startsWith("n"));
	System.out.println(a.endsWith("ne"));
	System.out.println(a.endsWith("e"));
	System.out.println(a.endsWith("a"));
	
	String b="  jayesh   ";
	System.out.println(b);
	System.out.println(b.trim());
	
	String b1="bhavesh";
	String b2="BHAVESH";
	System.out.println(b1.toUpperCase());          
	System.out.println(b2.toLowerCase());
	
	int k=10; int m=20;
	System.out.println(k+m);
	String l1=String.valueOf(k);
	String l2=String.valueOf(m);
	System.out.println(l1+l2);
	
	
	
	
	
	
	                       //  COMPARISION METHOD OF STRING           
	String c="jack";
	String d="jack";                          //uppercase and lowercase consider different
	System.out.println(c.equals(d));
	
	String e="rahil";
	String f="RAHIL";
	System.out.println(e.equalsIgnoreCase(f));    //ignore the upper and lowercase and consider both are same
	
	String s1="jayesh";
	String s2="Sonawane";
	System.out.println(s1.concat(s2));
	System.out.println(String.join(";",s1,s2,s1));*/
	
	String s3="jayesh24Sonawane444";
	/*System.out.println(s3.subSequence(6,16));
	System.out.println(s3.subSequence(2,8));
	System.out.println(s3.substring(2, 8));
	System.out.println(s3.substring(2));*/
	System.out.print(s3.subSequence(6,8));
	System.out.println(s3.subSequence(16, 19));
	
	/*String a1="this is demo";
	System.out.println(a1.replace("is","was"));    //jaha par is dikhega replace karega was likhega
    System.out.println(a1.replaceFirst("is","was"));  //first me jo dikhega wahi replace karega
    System.out.println(a1.replaceAll("is","was")); //first me dikhega o and then bad me dikhega o bhi replace karega
    */
    
	String a = "sharda";
	char[]chararray=a.toCharArray();
	Arrays.sort(chararray);
	System.out.println(new String(chararray));

}
}
