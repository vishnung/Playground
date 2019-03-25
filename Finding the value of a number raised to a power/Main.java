import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int i = 1;
      int result = 1;
      while(i <= exponent)
      {
        result = result * base;
        i++;
      }
      System.out.println(result);
    }
}