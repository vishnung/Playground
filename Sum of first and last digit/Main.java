import java.util.Scanner;
public class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int p;
      int sum;
      
        p = n%10;
      
      while(n>9)
      {
       n = n/10;
      }
      
      sum = p+n;
      System.out.println(sum);
      
	}
}