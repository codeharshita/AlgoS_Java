import java.util.*;
public class GetBit {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the number");
	      int n = sc.nextInt();
	      System.out.println("Enter the position number");
	       int pos =sc.nextInt();
	       int bitMask = 1<<pos;
	       
	      if((bitMask & n ) == 0) {
	    	  System.out.println("The bit is a zero");
	      }else {
	    	  System.out.println("The bit is non-zero or one");
	      }
	       
	       
	       
	}

}
