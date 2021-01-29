/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    
package inhee;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class singleinheritance1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        result obj=new result();
        obj.calculate();
        obj.display();
        
    }
    
}
class student
{
  String name;
  String rollno;
  Scanner obj=new Scanner(System.in);
 public void read()
    {
       System.out.println("Enter the name:");
        name=obj.next();
         System.out.println("Enter the rollno:");
        rollno=obj.next();
    }
  public void display()
    {
        System.out.println("Student Details:");
        System.out.println("Student name:"+name);
        System.out.println("Student rollno:"+rollno);
       
    }
  
}
class mark extends student
{
     double m1,m2,m3;
     public void read()
     {
         super.read();//calling super class method i.e both,if same method name use this method else normal method
         System.out.println("Enter Mark1:");
         m1=obj.nextDouble();
          System.out.println("Enter Mark2:");
         m2=obj.nextDouble();
          System.out.println("Enter Mark3:");
         m3=obj.nextDouble();
     }
     public void display()
     {
         super.display();
         System.out.println("Mark1:"+m1+"\nMark2:"+m2+"\nMark3:"+m3);
     }
     
}
class result extends mark
{
    double tot,avg;
    public void calculate()
    {
        super.read();
     tot = m1+m2+m3;
     avg=tot/3;
    }
    public void display()
    {
       super.display();
        System.out.println("Result:");
       System.out.println("The total mark is:"+tot);
         System.out.println("The average mark is:"+avg);
    }
}

