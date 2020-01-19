import java.util.Scanner;
import java.util.*;
 
public class PythagoreanTriplets {
    
   public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    int i=0;
    int j=a-1;
    int k=j-1;
    int a=s.nextInt();
     int arr[]=new int[a];
       for(int i=0;i<a;i++)

     arr[i]=sc.nextInt();
     Arrays.sort(arr);
    int flag=0;
   for(j=a-1;j>1;j--)
{ 
       i=0;
       k=j-1;
       while(i<k)
{
      if(arr[i]*arr[i]+arr[j]*arr[j]+arr[k]*arr[k])
{
        flag=1;
      System.out.println("Yes");
       break;
}
     else if(arr[i]*arr[i]+arr[k]*arr[k]<arr[j]*arr[j])
      i++;
     else
       k--;
}
     if(flag==1)
     break;
}
     if(flag==0)
     System.out.println("No");
}
}
    