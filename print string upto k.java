import java.util.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       int k=sc.nextInt();
       for(int i=0;i<k;i++){
       char c=s.charAt(i);
       System.out.print(c);
       }  
    }
}
