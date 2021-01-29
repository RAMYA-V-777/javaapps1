/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nestescls;

/**
 *
 * @author velmurugan
 */
public class anonymous {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        demo obj=new demo()
        {
            void display()//can be n no of abstract method here instead of down there,here there is no cls name but the compiler will be creating a name like $1.If more than one abs cla ,compiler will be creating another name like $2 etc... the compiler
            {
                 System.out.println("Abstract method");
            }
        };
        obj.display();//calling above abstract method
        demo1 obj1=new demo1()
        {
            void display1()//can be n no of abstract method here instead of down there,here there is no cls name but the compiler will be creating a name like $1.If more than one abs cla ,compiler will be creating another name like $2 etc... the compiler
            {
                 System.out.println("Abstract method");
            }
        };
        obj1.display1();//calling above abstract method
        
    }
    
}
abstract class demo
{
    abstract void display();
}
abstract class demo1
{
    abstract void display1();
}
/*class sample extends demo
{
    void display()
    {
         System.out.println("Innner cls method");
    }
}*/
