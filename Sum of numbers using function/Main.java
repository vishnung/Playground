import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    System.out.print(sum_of_numbers(num)); 
	}
   
	public static int sum_of_numbers(int y)
	{
	    int sum = 0;
	    for(int n = 1; n<= y; n++)
	    {
	        sum = sum + n;
	    }
	    return sum;
	}
} 