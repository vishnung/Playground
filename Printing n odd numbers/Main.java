import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int num;
    for(num = 1; num <= n*2; num = num + 1)
    {
      if(num % 2 != 0)
        System.out.println(num);
    }
  }
}
  