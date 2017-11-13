import java.util.Scanner;
package com.prime;
public class Num
{
  public static void main(String []args)
  {
   Scanner obj = new Scanner(System.in);
   int i  = obj.nextInt();
   boolean flag=false;
   for(int j=2; j<=i/2; j++)
   {
    if(i%j==0)
    {
     flag = true;
     break;
    }
   }
   if(flag == true)
    System.out.println("Number is not Prime");
   else
    System.out.pintln("Number is prime");
  }
 } 
