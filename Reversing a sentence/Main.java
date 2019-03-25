import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int str_len = sb.length();
      reverse_string(sb, 0, str_len - 1);
        int start_i = 0;
        for(int i = 0; i < str_len; i++)
        {
            if(sb.charAt(i) == ' ')
            {
                
                reverse_string(sb, start_i, i - 1);
                start_i = i + 1;
            }
            else if(i == (str_len - 1))
            {
                reverse_string(sb, start_i, i);
                start_i = i + 1;
            }
        }
        System.out.print(sb);
    }
    public static void reverse_string(StringBuilder sb, int start_i, int end_i)
    {
        int end = end_i;
        int front = start_i;
        while(front < end)
        {
            char tmp_ch = sb.charAt(front);
            sb.setCharAt(front, sb.charAt(end));
            sb.setCharAt(end, tmp_ch);
            front++;
            end--;
        }
    }
}