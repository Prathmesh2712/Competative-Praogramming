package patterns;
import java.util.*;
public class pattern1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of pattern");
        int n=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}