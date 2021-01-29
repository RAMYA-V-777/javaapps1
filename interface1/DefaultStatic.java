/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interface1;

/**
 *
 * @author velmurugan
 */
public class DefaultStatic {//WORK ONLY IN JDK 1.8

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("OBJ CREATION-1");
        test1 obj=new test1();
        obj.display();
        obj.display1();//cant access static method
        System.out.println("OBJ CREATION-2");
        one obj1=new one1();
        obj1.display();
        obj1.display1();
        one.display2();//to access static method
        
    }
    
}
interface one
{
    void display();
    default void display1()
    {
        System.out.println("Default method");
    }
    static void display2()
    {
        System.out.println("Static method");
    }
}
class one1 implements one
{
    public void display()
    {
        System.out.println("Demo");
    }
}