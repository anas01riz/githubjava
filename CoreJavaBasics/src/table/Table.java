package table;

import java.util.*;
class Table 
{
 public static void main(String args[])
 { 
    String s1 = "Hello";
    String s2 = new String(s1);
    String s3 = "HELLO";
    System.out.println(s1.equals(s2) + " " + s2.equals(s3));
 }
}