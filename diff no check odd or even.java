import java.util.*;
public class hour
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int result=n-m;
        if(result%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
}


