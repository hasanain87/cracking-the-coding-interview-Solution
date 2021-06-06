import java.util.Scanner;

public class Plindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		System.out.println("Enter your srtring");
		String s= input.nextLine();
		System.out.println(isPalindrome(s));

	}

	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		
		String s1= fillter(s);
		String s2= reverse(s1);
		
		
		
		return  s2.equals(s1);
	}

	private static String reverse(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder(s);
		sb.reverse();		
		return  sb.toString();
	}

	private static String fillter(String s) {
		StringBuilder sb= new StringBuilder();
		for (int i =0; i<s.length();i++)
			if(Character.isLetterOrDigit(s.charAt(i))){	
				sb.append(s.charAt(i));	
			}
		return sb.toString()  ;
	}

}
