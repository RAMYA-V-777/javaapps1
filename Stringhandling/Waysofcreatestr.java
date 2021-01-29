/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stringhandling;
import java.util.*;

/**
 *
 * @author velmurugan
 */
public class Waysofcreatestr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String Constructor
        //1.default
        String s=new String();
        s="OOPS class";
       // System.out.println(s.getClass());
      //sam obj=new sam();//[()----->for calling constructor-->Eventhough there is no constructor java will call default constructor]
     //System.out.println(obj.a);
        //CHAR ARRAY-->we can also get a string by char array=O/P->(doglove)
        char c[]={'d','o','g','l','o','v','e'};
        String s1=new String(c);
        System.out.println(s1);
     //CHAR ARRAY WITH RANGE--->same as above with range=0/P->(ogl)
        String s2=new String(c,1,3);//c-->String,1-->Start value,3->End value-1
        System.out.println(s2);
        //BYTE ARRAY->ASCII VALUE  TO CHAR-->then to string=0/P->(ABSCU)
        byte b[]={65,66,67,83,85};
        String s3=new String(b);
        System.out.println(s3);
        //BYTE ARRAY WITH RANGE--->to specify specific value
         String s4=new String(b,0,2);//same as char array with range=O/P-?(AB)
        System.out.println(s4);
        //THROUGH STRING OBJECT--->O/P->(OOPS class)->i.e(Through the string already present)
        String s5=new String(s);//same as athe string s as we are giving the value of s to s5
        System.out.println(s5);     
       }    
}
/*METHODS PRESENT HERE
=>CHAR ARRAY-->we can also get a string by char array=O/P->(doglove)
=>CHAR ARRAY WITH RANGE--->same as above with range=0/P->(ogl)
=>BYTE ARRAY->ASCII VALUE  TO CHAR-->then to string=0/P->(ABSCU)
=>BYTE ARRAY WITH RANGE--->to specify specific value
=>THROUGH STRING OBJECT--->O/P->(OOPS class)->i.e(Through the string already present)
*/