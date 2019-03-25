import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int index = 0; index <= n - 1; index++)
        {
            arr[index] = in.nextInt();
        }
        int missing_val = 0;
        for(int val = 1; val <= n; val++)
        {
            boolean is_found = false;
            for(int indx = 0; indx <= n - 1; indx++){
                if(arr[indx] == val)
                {
                    is_found = true;
                    break;
                }
            }
            if(is_found == false)
            {
                missing_val = val;
                break;
            }
        }
        System.out.print(missing_val);
    }
}