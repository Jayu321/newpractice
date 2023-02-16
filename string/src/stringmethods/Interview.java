package stringmethods;

public class Interview {public static void main(String[] args) {
	
	String s= "jayesh and nikhil ";
	String reverse="";
	for(int i= s.length()-1; i>=0; i--)
	{
		
		reverse = reverse+s.charAt(i);
	}
	System.out.println(reverse);
	
	
	System.out.println("Nikhil");
}

}
