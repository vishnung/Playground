import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int res = 0, num;
      int temp;
      temp = n;
      while(n > 0)
      {
        int fact = 1;
        num = n%10;
        for( int i = 1; i <= num; i++)
          fact = fact * i;
        res = res + fact;
        n = n/10;
      }
      if(temp == res)
        System.out.print("Yes");
      else
        System.out.print("No");
	}
}