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
public class meminnercls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outer obj=new outer();
        obj.display1();
        outer.inner obj1=obj.new inner();//outerclsname.innerclsname objectname=outerclasobjname.new innerclsname
        obj1.display();
    }
    
}
class outer
{
    private int a=10;
    class inner
    {
        void display()
        {
            System.out.println("Inner class method......................"+a+a);
        }
    }
    void display1()
    {
         System.out.println("Outer class method");
    }
}