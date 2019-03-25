import java.util.Scanner;
class Main
{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    System.out.print(square_of_digit(n));
  
    } 
	public static int square_of_digit(int num)
	{
	    int square = num * num;
	    return square;
	} 
} 
