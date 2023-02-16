package stringmethods;

public class Method2 {public static void main(String[] args) {
	String name = "jayesh";
	name=name.concat("sonawane");
	System.out.println(name);
	
	          
	StringBuffer e =new StringBuffer("jayeshsonawane");
	System.out.println(e.reverse());
	
	StringBuilder d =new StringBuilder("jayeshsonawane");
	System.out.println(d.reverse());
	
	//===============================//
	
	String s="jayesh"; 
	
	String rev="";
	
	for(int i=s.length()-1; i>=0; i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}

}
