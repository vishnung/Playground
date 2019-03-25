import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      System.out.print(great(n1,n2,n3));
    }
  public static int great(int n1,int n2,int n3)
  {
    int num,m;
    {
    if(n1>n2)
      num = n1;
    else
      num = n2;
    }
    {
    if(num>n3)
      m = num;
    else
      m = n3;
    }
    return m;
  }
  
	}
