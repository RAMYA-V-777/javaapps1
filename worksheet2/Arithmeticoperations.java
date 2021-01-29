/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worksheet2;
import java.util.Scanner;


class operation{
    int a;
    int b;
    
    void passvalue(){
         Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a=obj.nextInt();
        System.out.println("Enter the value of b:");
        b=obj.nextInt();
    }
    void add(){
          int add=a+b;
        System.out.println("The sum of two numbers a and b is:"+add);
    }
    void sub(){
         int sub=a-b;
        System.out.println("The difference of two numbers a and b is:"+sub);
    }
    void mul(){
        int mul=a*b;
        System.out.println("The product of two numbers a and b is:"+mul);
    }
    void div(){
        int div=a/b;
        System.out.println("The division of two numbers a and b is:"+div);
    
    }
    void printresult(){
         System.out.println("The arithmetic operations are:");
         System.out.println("The sum of two numbers a and b is:"+(a+b));
         System.out.println("The difference of two numbers a and b is:"+(a-b));
         System.out.println("The product of two numbers a and b is:"+(a*b));
         System.out.println("The division of two numbers a and b is:"+(a/b));
    }
         
    }
    
        
      
        
    

/**
 *
 * @author velmurugan
 */
public class Arithmeticoperations {
    public static void main(String[] args){
        
         operation obj=new operation();
       
         obj.passvalue();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        obj.printresult();
    }
    
    
}
