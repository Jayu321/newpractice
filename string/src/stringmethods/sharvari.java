package stringmethods;

public class sharvari {public static void main(String[] args) {
	
	String s= "pranita and sharvari ";
	String reverse="";
	for(int i= s.length()-1; i>=0; i--)
	{
		
		reverse = reverse+s.charAt(i);
	}
	System.out.println(reverse);
	
	
	System.out.println("pranita");
}

}
