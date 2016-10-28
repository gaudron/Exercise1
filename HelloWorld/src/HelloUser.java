
import java.util.Scanner;


public class HelloUser {

	public static void main(String[] args) {
System.out.println("Hello ASE2016 - how are you ? :)");
		
		Scanner username = new Scanner( System.in );
		String name;
		System.out.print("Please enter your name: " );
		name = username.next( );
		System.out.println("Hello "  + name + " !" );
	}
}
