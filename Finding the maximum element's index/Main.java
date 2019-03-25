import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    int largest_i;
    for(int i = 0; i <= n-1; i++)
    {
      list[i]=in.nextInt();
    }
    if(list[0]>list[1])
    {
      largest_i = 0;
    }
    else
    {
      largest_i = 1;
    }
    for(int idx = 2; idx <= n-1; idx++)
    {
      if(list[largest_i] < list[idx])
      largest_i = idx;
    }
    System.out.print(largest_i);
  }
  }
