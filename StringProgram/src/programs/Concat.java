package programs;

import java.util.*;
public class Concat
{
    public static void main(String[] args)
    {
         //Initialize    
         String s1="new";
         String s2="beginning";

         String s3=s1.concat(s2);
         System.out.println(s3);

         String s4=s1+s2;
         System.out.println(s4);

    }
}