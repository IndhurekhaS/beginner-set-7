import java.util.*;
public class nearest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=(n/10)*10;
        int b=a+10;
        int c=n-a;
        int d=b-n;
        if(c>d)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}
