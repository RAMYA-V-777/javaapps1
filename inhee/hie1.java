/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
hie
=clg[name,code//supr class
=student[name,rollno,dept]
staff[name,staffid,dept]
*/
package inhee;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class hie1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        stu st=new stu();
        st.read();
        st.display();
        stf s=new stf("aaa","cse34","cse");
    }
    
}
class clg//super class
{
    String name="VCET";
    int code=9131;
    
}
class stu extends clg
{
    String name1;
    String roll;
    String dept;
    void read()
    {
        Scanner obj=new Scanner(System.in);
        name1=obj.next();
        roll=obj.next();
        dept=obj.next();
    }
    void display()
    {
        System.out.println("CLGNAME:"+name+"\nCODE"+code);
        System.out.println("NAME:"+name1+"\nROLLNO"+roll+"\nDEPT:"+dept);
    }
}
class stf extends clg
{
      String name2;
    String stfid;
    String dept1;
   stf(String n,String sid,String d)
   {
       name2=n;
       stfid=sid;
       dept1=d;
       
   }
   public String toString()
   {
   System.out.println("NAME:"+name2+"\nROLLNO"+stfid+"\nDEPT:"+dept1);
   }
   
}