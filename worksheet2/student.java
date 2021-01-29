/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worksheet2;
import java.util.Scanner;

class Stud
{
    String name;
    String dept,status;
    int m1,m2,m3;
    void getvalue()
    {
     
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the name of the student:");
       name=obj.next();
       System.out.println("Enter the department of the student:");
       dept=obj.next();
       System.out.println("Enter m1,m2,m3:");
       m1=obj.nextInt();
       m2=obj.nextInt();
       m3=obj.nextInt();
      
    }
    void calgrade()
    {
        int ave=((m1+m2+m3)/3);
        System.out.println("The average mark of the student is:"+ave);
      
        if(ave>=80)
           status="First class";
        else if((ave>=70)&&(ave<=79))
            status="second class";
         else if((ave>=50)&&(ave<=69))
               status="third class";
        else
             status="Fail";
    }
    void display()
    {
       
         System.out.println("The student's details are:");
         System.out.println("Name:"+name);
         System.out.println("Department:"+dept);
         System.out.println("Computer mark:"+m1);
         System.out.println("Maths mark:"+m2);
         System.out.println("Physics marks:"+m3);
         System.out.println("Average of the student:"+(m1+m2+m3)/3);
         System.out.println("Status:"+status);
         
       
        
       
    }
        
}


/**

*
 * @author velmurugan
 */
public class student{
     
    public static void main(String[] args){
       
        
     Stud obj[]=new Stud[50];
     for(int i=0;i<50;i++)
     {
         obj[i]=new Stud();
         obj[i].getvalue();
         obj[i].calgrade();
         obj[i].display();
     }
         
     }

    
    }
        
        
    

