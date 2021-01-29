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
public class multipleinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("OBJECT CREATION-1");
        test1 obj=new test1();
        obj.display();
        obj.display1();
        System.out.println("OBJECT CREATION-2 BY ");//Reference method
        demo1 obj1=new test1();
        obj1.display();
        demo2 obj2=new test1();//because demo2 extends(inherits) demo1 both the display are printing
        obj2.display();
        obj2.display1();
    }
    
}
interface demo1
{
    int b=10;
    void display();
}
interface demo2 extends demo1
{
    int c=10;
    void display1();
}

class test1 implements demo1,demo2
{
    public void display()
    {
        System.out.println("Interface Implementation------------"+b);
    }
    public void display1()
    {
        System.out.println("Interface Implementation-2-------------"+c);
    }
}