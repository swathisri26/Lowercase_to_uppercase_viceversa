import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
		StringBuffer s1= new StringBuffer(str);
		for(int i=0;i<str.length();i++){
		    if(Character.isLowerCase(str.charAt(i))){
		       s1.setCharAt(i,Character.toUpperCase(str.charAt(i)));
		    }else if(Character.isUpperCase(str.charAt(i))){
		         s1.setCharAt(i,Character.toLowerCase(str.charAt(i)));
		        
		    }
		}
	
	    System.out.println(s1);
	
	}
}
