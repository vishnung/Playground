import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      System.out.print(greatest_num(n1,n2,n3));
    }
  public static int greatest_num(int n1, int n2, int n3)
  {
    int min1,min2,num,num1=0;
    {
    if(n1>n2)
       min1 = n2;
  else
    min1 = n1;
    }
    while(min1>=1)
    {
      if(n1 % min1 == 0 && n2 % min1 == 0)
      {
        num = min1;
        break;
      }
      min1--;
    }
    
    {
    if(min1>n3)
       min2 = n3;
  else
    min2 = min1;
    }
    while(min2>=1)
    {
      if(min1 % min2 == 0 && n3 % min2 == 0)
      {
        num1 = min2;
        break;
      }
      min2--;
    }
    return num1;
  }
}