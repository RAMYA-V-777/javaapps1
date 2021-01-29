/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stringhandling;

/**
 *
 * @author velmurugan
 */
public class strcncatenate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //STR CONCATENATION
        String s="welcome";
        String s1=" OOPS class";
        System.out.println(s+s1+(40+50));
        //LENGTH OF THE STR
        System.out.println(s.length());
        //CHARACTER EXTRACTION METHODS
        System.out.println(s.charAt(5));
        //REVERSE STRING
        String str="";
       for(int i=s.length()-1;i>=0;i--)
       {
           str=str + s.charAt(i);
       }
       System.out.println(str);
       //getchar methods[from str take a char and store in  chararray]
       char c[]=new char[10];
       s1.getChars(1,7,c,0);
       for(int i=0;i<6;i++)
       System.out.println(c[i]);
       //getbyte--->store str in byte array
       byte b[]=new byte[10];
       b=s1.getBytes();
       for(int i=0;i<b.length;i++)
       System.out.println((char)b[i]);//typecast ascii to char
       char c1[]=new char[20];//char to byte array
       c1=s1.toCharArray();
       for(int i=0;i<c1.length;i++)
       System.out.println(c1[i]);
       
       
    }
    
}
