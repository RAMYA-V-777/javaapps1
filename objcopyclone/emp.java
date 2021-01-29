/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package objcopyclone;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
public class emp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    emp1 obj[]=new emp1[5];
    
    for(int i=0;i<5;i++)
    {
       obj[i]=new emp1();
       System.out.println("Employee Name is: "+obj[i].name);
         System.out.println("Employee ID is: "+obj[i].id);
        System.out.println("Employee Age is: "+obj[i].age);
         System.out.println("Employee Designation is: "+obj[i].desg);
         System.out.println("Employee Department is: "+obj[i].dept);
          System.out.println("Employee Salary is: "+obj[i].salary);
        
    }
    for(int i=0;i<5;i++)
    {
       //obj[i].display();
        //void display()
    
         System.out.println("Name of the employee:"+obj[i].name);
         System.out.println("ID of the employee:"+obj[i].id);
         System.out.println("Age of the employee:"+obj[i].age);
         System.out.println("Designation of the employee:"+obj[i].desg);
         System.out.println("Department of the employee:"+obj[i].dept);
         System.out.println("Salary of the employee:"+obj[i].salary);
    }
    
     for( int i=0;i<5;i++)
    {
        if(obj[i].dept.equals("CSE")&&obj[i].salary>10000)
        {
            System.out.println("Employee name"+obj[i].name);
            System.out.println("Employee name"+obj[i].desg);
            
        }
        
    }
    
}
class emp1
{
    String name,dept,desg;
    int id,age;
    double salary;
    emp1()
            {
                //Default constructor
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the name of the employee:");
       name=obj.next();
       System.out.println("Enter the ID of the employee:");
       id=obj.nextInt();
       System.out.println("Enter the age of the employee:");
       age=obj.nextInt();
       System.out.println("Enter the designation of the employee:");
       desg=obj.next();
       System.out.println("Enter the department of the employee:");
       dept=obj.next();
       System.out.println("Enter the salary of the employee:");
        salary=obj.nextDouble();
            }
    
}