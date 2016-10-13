
import java.util.Scanner;
public class CollatzProblem {

	static long n=0;
	static int syx=0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				/* gerade -> n/2
				 * ungerade -> 3n+1
				 */
	    Scanner scan = new Scanner( System.in );

	    System.out.print("Gib mir den zahl: ");
	    n = scan.nextLong();
		
		while (n>0){	
			if (n%2==0){
				n=n/2;
			}
			else {n=n*3+1;}
			
			System.out.println(n+", ");
			syx++;	
		}
		System.out.println(syx);
	}

}
