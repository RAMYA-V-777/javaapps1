/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author velmurugan
 */
public class STUINFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s1=new student("Apple",10);//frst adding method
         student s2=new student("Mango",20);
         ArrayList<student> list=new ArrayList<>();
         list.add(s1);//frst adding method
         list.add(s2);
         list.add(0,new student("Orange",30));//constructor manner addind ele to list->0 represents index(i.e Frst element)
         Collections.sort(list,new marksort());
         System.out.println(list);
         Collections.sort(list,new namesort());
         System.out.println(list);
        
    }
    
}
class student
{
    String name;
    double mark;
    student(String n,double m)//constructor
    {
        name=n;
        mark=m;   
    }
    @Override
    public String toString()
    {
        return "\nName------"+name+"\tMark------"+mark;
    }
}
//CUSTOM SORTING
class marksort implements Comparator<student>//inbuilt interface for sorting
{
   public int compare(student s1,student s2)
   {
       System.out.println(s1.mark+"..."+s2.mark);
       return(int)(s2.mark-s1.mark);// either +ve or -ve.if =--->no swap,if minus---->swap,,if s1-s2--->print in ascending order,,if s2-s1----->print in descending order
       //s1--->second no,s2--->frst no
   }
}
class namesort implements Comparator<student>//inbuilt interface for sorting
{
   public int compare(student s1,student s2)
   {
       System.out.println(s1.name+"..."+s2.name);
       return s1.name.compareTo(s2.name);// either +ve or -ve.if +--->no swap,if minus---->swap,,if s1-s2--->print in ascending order,,if s2-s1----->print in descending order
       //s1--->second no,s2--->first no
   }
}