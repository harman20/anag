import java.util.*;
public class Anagram 
{
     public static void main(String[] args)
     {
     Scanner sc=new Scanner(System.in);
     String S1=new String();
     S1=sc.next();
     String S2=new String();
     S2=sc.next();
     
     char arr1[]=S1.toCharArray();
     char arr2[]=S2.toCharArray();
     Arrays.sort(arr1);
     Arrays.sort(arr2);
     int flag=0;
     for(int i=0;i<S1.length;i++)
     {
     if(arr1[i] != arr2[i])
     {
     flag++;
     }
     }
     if(flag==0)
     {
     System.out.println("Is Anagram");
     }
     else
     {
     System.out.println("Not an Anagram");
     }
     sc.close();
     }
     }
