import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp, i, k=0;
      temp = n;
      while(n>0)
      {
        i = n%10;
        n = n/10;
        k = k + (i*i*i);
      }
      if(temp == k)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
        
	}
}