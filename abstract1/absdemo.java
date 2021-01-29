/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstract1;

/**
 *
 * @author velmurugan
 */
public class absdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sample obj=new b();//creating obj for abstract cls
        obj.add();
        obj.sub();
        obj.display();
    }
    
}
abstract class sample//called concrete class//within a class only any methos should be there
{
abstract void add();//should be present only in abstart class not in normal cls
abstract void sub();//can have abs method
void display()//also have normal method
{
    
System.out.println("Sample");

}
}
class b extends sample//b is an inherited cls where implementation part is present
{
    void add()//imple part
    {
        
System.out.println("add method");

    }
    void sub()//imple part
    {
        {
System.out.println("Sub method");
}
    }
}