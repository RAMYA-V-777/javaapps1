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
public class strcmp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //equals and equalsIgnorecase
        String s="oops";
        String s1="Oops";
      if(s.equals(s1))
System.out.println("Equal");//equals-->case sensitive also will check --->is of boolean type
            else
  System.out.println("NotEqual");
        if(s.equalsIgnoreCase(s1))
System.out.println("Equal");//equals-->case sensitive also will check --->is of boolean type
            else
  System.out.println("NotEqual");
        //region matches----->in a string check for a particular part
        System.out.println("oops class".regionMatches(true,0,s,1,2));//-->srcstring index,needed=2nd str,2nd str index,no of char in both the string
        //true-------->ignorecase,false->not ignore case
        //startswith---->check from initial
        System.out.println(s.startsWith("j",5));//return boolean
        //endswith----->check from end
            System.out.println(s.endsWith("jjj"));//return boolean
            //compareTo-->int=>pos,neg,0-------->used for sorting names========return int
            String s2="abc";//str1 97-100(unicode) =-=====reversed 100-97
            String s3="def";//str2 
        //   if(s2.compareTo(s3))since it is not boolean it is an  error
                     if(s3.compareTo(s2)>0)//str1.compareTo(str2)
                            System.out.println("str1 > str2");
                     else
                            System.out.println("str2 > str1");
                     //search the string
                     //indexOf method
             System.out.println("welcome to oops class".indexOf("class"));//pass a string
             System.out.println("welcome to oops class".indexOf('t'));//pass a character
             System.out.println("welcome to oops class oops".indexOf("oops",16));//ignoring one occurrence and finding index for another occurrence
             System.out.println("welcome to oops class".indexOf('s',15));//same as above for character
             //lastindexOf
                  System.out.println("welcome to oops class to".lastIndexOf("to"));//pass a string->checking from last
             System.out.println("welcome to oops class".lastIndexOf('t'));//pass a character------>checking from last
             //substring-->to modify the string/extracting a part of the string
                  System.out.println("welcome to oops class".substring(11));
             System.out.println("welcome to oops class".substring(11,14));//end is end-1
             //replace-.change one char to another char
                  System.out.println("welcome to oops class".replace('o','r'));
            //trim->trim white spaces before and after the string not inbetween the strings
                 String str="\n \twelcome to oops class";
                 System.out.println(str.trim());
                 //toLoweCase,toUpperCase
                   System.out.println("welcome to oops class".toUpperCase());
                    System.out.println("welcome to oops class".toLowerCase());
                    //split--->used in wordcount in sentence or paragraph
                    String str1[]=str.split(":");//str.split("")---->generate substring and store in an array
                    for(String i:str1)
                        System.out.println(i);
             //contains->whether it is contained in the string or not
                      //  System.out.println("welcome to oops".contains("to"));
                        
                    
             
    }
    
    
}
